package net.RPower.RPowermod.machines.power.cable;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import RPower.api.power.E_MFPacketType;
import RPower.api.power.I_MFSink;
import RPower.api.power.MFPacket;
import RPower.api.power.cable.I_MFCable;
import net.RPower.RPowermod.core.RPCore;
import net.RPower.RPowermod.machines.power.MFHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityFluxCable extends TileEntity implements I_MFCable {
	//Connections are an array of [Up, Down, North, East, West, South]
	public List<PipeDirection> connections;

	//whether or not the cable is lossy
	public boolean insulatedCable;

	//maximum limit the cable can carry
	public double packetSizeLimit;

	//Packets awaiting processing
	public Queue<MFPacket> internalBuffer;

	//automatically calculated.
	public double percentageLoss;

	//transfer mode, unbridged connections can only cross an intersection in straight lines (may be reserved for advanced cabling)
	public boolean bridgeConnections;

	public TileEntityFluxCable()
	{
		this(32);
	}

	public TileEntityFluxCable(double packetSize)
	{
		this(packetSize,false);
	}

	public TileEntityFluxCable(double packetSize, boolean insulated)
	{
		this(packetSize,insulated,true);
	}
	public TileEntityFluxCable(double packetSize, boolean insulated,boolean bridged)
	{
		packetSizeLimit= packetSize;
		insulatedCable=insulated;
		bridgeConnections=bridged;
		connections=new LinkedList<PipeDirection>();
		internalBuffer=new LinkedList<MFPacket>();
		checkLoss(insulated);
	}

	private void checkLoss(boolean insulated) {
		if(!insulated)
		{
			percentageLoss=(packetSizeLimit/MFPacket.POWERLIMIT);
		}
	}

	@Override
	public boolean takePacket(MFPacket packet)
	{
		double excess=0;
		if(!insulatedCable)
		{

			excess+=(percentageLoss*packet.getBuffer());
			packet.setBuffer(packet.getBuffer()-excess);
		}
		if(packet.getBuffer()>packetSizeLimit)
		{
			excess += packet.getBuffer()-packetSizeLimit;
			packet.setBuffer(packetSizeLimit);
		}
		powerBleed(excess);

		boolean result=false;
		result=internalBuffer.add(packet);
		return result;
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTag) {
		byte[] connectionsArr = new byte[connections.size()];
		int i =0;
		for (PipeDirection connection: connections) {
			connectionsArr[i] = connection.toByte();
			i++;
		}
		nbtTag.setByteArray("connections", connectionsArr);
		nbtTag.setBoolean("insulated", insulatedCable);
		nbtTag.setBoolean("bridged", bridgeConnections);

		nbtTag.setDouble("packetLimit", packetSizeLimit);

		super.writeToNBT(nbtTag);
	};

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		byte[] connectionsArr = nbtTag.getByteArray("connections");
		for (byte b : connectionsArr) {
			PipeDirection temp = MFHelper.CheckDirection(b);
			connections.add(temp);
		}

		insulatedCable=nbtTag.getBoolean("insulated");

		bridgeConnections=nbtTag.getBoolean("bridged");

		packetSizeLimit=nbtTag.getDouble("packetLimit");

		checkLoss(insulatedCable);

		super.readFromNBT(nbtTag);
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound nbtTag = new NBTTagCompound();
		this.writeToNBT(nbtTag);
		//TODO: Get this damn working!
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
	}

	@Override
	public void onDataPacket(NetworkManager networkManager, S35PacketUpdateTileEntity packet) {
		readFromNBT(packet.func_148857_g());
	}

	@Override
	public void updateEntity() {
		if(!internalBuffer.isEmpty())
		{
			MFPacket packet = internalBuffer.remove();
			boolean result=false;
			byte  direction;
			for(int i=0; i<59;i++)
			{
				int posNeg = ((int)(Math.random()*8)%2==0)?1:-1;
				double randXvel=Math.random()*(2*posNeg);
				double randYvel=Math.random()*(2*posNeg);
				double randZvel=Math.random()*(2*posNeg);
				this.worldObj.spawnParticle("magicCrit", xCoord, yCoord, zCoord, randXvel, randYvel, randZvel);
			}

			switch(packet.getType())
			{
			case RESPOND:
				direction = packet.getOrigin().peek();
				result = (direction!=-1);
				result = pushPacket(packet);
				break;
			default:
				direction = packet.getOrigin().peek();
				packet.getOrigin().add(randDir(direction).toByte());
				result=pushPacket(packet);
				break;
			}
		}
		super.updateEntity();
	}

	private PipeDirection randDir(byte initDirection) {
		int randNum=(int)(Math.random()*connections.size());
		return connections.get(randNum);
	}


	public boolean checkConnections()
	{
		boolean result=false;
		
		
		
		return result;
	}

	@Override
	public boolean pushPacket(MFPacket packet)
	{

		byte direction = packet.getOrigin().peek();
		if(packet.getType()==E_MFPacketType.RESPOND)
			packet.getOrigin().pop();

		boolean result= false;
		int[]origin = {xCoord,yCoord,zCoord};
		int[] target = MFHelper.CheckDirection(direction).getTarget(origin);
		result = this.worldObj.getBlock(target[0], target[1], target[2]).hasTileEntity(0);
		if(result)
			result=this.worldObj.getTileEntity(target[0], target[1], target[2])instanceof I_MFSink;
		if(result)
			result=((I_MFSink)this.worldObj.getTileEntity(target[0], target[1], target[2])).takePacket(packet);
		if(!result)
			powerBleed(packet.getBuffer());
		return result;
	}

	@Override
	public boolean canUpdate()
	{
		return true;
	}

	@Override
	public double flowLimit() {
		return packetSizeLimit;
	}

	@Override
	public void powerBleed(double excess) {
		//add power bleed to chunk atmosphere -> own effects + taint if Thaumcraft installed
		if(excess>0)
			System.err.println(""+excess+" MF bled off into atmosphere!\n");

	}

	@Override
	public double getPacketLimit() {
		return packetSizeLimit;
	}

	@Override
	public boolean isInsulated() {
		return insulatedCable;
	}

	@Override
	public boolean isBridged() {
		return bridgeConnections;
	}

	@Override
	public boolean canDeBridge() {
		return insulatedCable;
	}

	@Override
	public List<PipeDirection> getConnections() {
		return connections;
	}

}
