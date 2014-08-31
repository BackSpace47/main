package net.RPower.RPowermod.machines.power.cable;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.sound.midi.spi.MidiFileReader;

import RPower.api.power.block.I_MFSink;
import RPower.api.power.block.cable.I_MFCable;
import RPower.api.power.block.cable.I_PipeDirection;
import RPower.api.power.core.E_MFPacketType;
import RPower.api.power.core.MFHelper;
import RPower.api.power.core.MFPacket;
import net.RPower.RPowermod.core.RPCore;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityFluxCable extends TileEntity implements I_MFCable {
	//Connections are an array of [Up, Down, North, East, West, South]
	public List<I_PipeDirection> connections;

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
	
	private double distLimit;

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
		connections=new LinkedList<I_PipeDirection>();
		internalBuffer=new LinkedList<MFPacket>();
		checkLoss(insulated);
		distLimit = insulatedCable?(4*packetSize):packetSize;
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
			excess += (packet.getBuffer()-packetSizeLimit);
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
		for (I_PipeDirection connection: connections) {
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
			I_PipeDirection temp = new PipeDirection(b);
			connections.add(temp);
		}

		insulatedCable=nbtTag.getBoolean("insulated");

		bridgeConnections=nbtTag.getBoolean("bridged");

		packetSizeLimit=nbtTag.getDouble("packetLimit");

		checkLoss(insulatedCable);

		super.readFromNBT(nbtTag);
	}

	//Fixed by Whov
	@Override
	public Packet getDescriptionPacket() {
		Packet packet = super.getDescriptionPacket();
    	NBTTagCompound nbtTag = packet != null ? ((S35PacketUpdateTileEntity)packet).func_148857_g() : new NBTTagCompound();
        writeToNBT(nbtTag);
		//TODO: Get this damn working!
		return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, nbtTag);
	}
	//Fixed by Whov
	@Override
	public void onDataPacket(NetworkManager networkManager, S35PacketUpdateTileEntity packet) {
		super.onDataPacket(networkManager, packet);
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

	private I_PipeDirection randDir(byte initDirection) {
		I_PipeDirection origin = new PipeDirection(initDirection);
		origin.invert();
		I_PipeDirection newDirection = origin;
		int attempt = 0;
		while (!connections.isEmpty()&&attempt<26&&newDirection.equals(origin))
		{
			attempt++;
			int randNum=(int)(Math.random()*connections.size());
			newDirection  = connections.get(randNum);
		}
		return newDirection;
	}

	
	

	@Override
	public boolean pushPacket(MFPacket packet)
	{
		boolean result= false;
		if(packet.getType()==E_MFPacketType.RESPOND&&packet.getBuffer()<=0)
		{
			packet=null;
		}
		if(packet!=null&&packet.getOrigin().size()<=distLimit);
		{

		byte direction = packet.getOrigin().peek();
		if(packet.getType()==E_MFPacketType.RESPOND)
			packet.getOrigin().pop();

		
		int[]origin = {xCoord,yCoord,zCoord};
		int[] target = new PipeDirection(direction).getTarget();
		for(int i=0;i<3;i++)
		{
			target[i]+=origin[i];
		}
		result = this.worldObj.getBlock(target[0], target[1], target[2]).hasTileEntity(0);
		if(result)
			result=this.worldObj.getTileEntity(target[0], target[1], target[2])instanceof I_MFSink;
		if(result)
			result=((I_MFSink)this.worldObj.getTileEntity(target[0], target[1], target[2])).takePacket(packet);
		if(!result)
			powerBleed(packet.getBuffer());
		}
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
	public List<I_PipeDirection> getConnections() {
		System.out.println("Getting "+(worldObj.isRemote?"Client":"Server")+" connections");
		return connections;
	}

	public String toJSON() {
		String result = "\n{";
		result+=("\n\t\"tileX\":\""+xCoord+"\",");
		result+=("\n\t\"tileY\":\""+yCoord+"\",");
		result+=("\n\t\"tileZ\":\""+zCoord+"\",");
		result+=("\n\t\"connections\":[\n");
		for (I_PipeDirection pipe : connections) {
			result+=(pipe.toJSON()+",\n");
		}
		result+="]";
		result+="\n}\n";
		
		return result;
	}

	@Override
	public boolean checkConnections() {
		int[] origin = {xCoord,yCoord,zCoord};
		return MFHelper.checkConnections(worldObj, origin);
	}
}