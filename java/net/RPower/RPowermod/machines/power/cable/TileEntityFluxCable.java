package net.RPower.RPowermod.machines.power.cable;

import java.util.LinkedList;
import java.util.Queue;
import RPower.api.power.E_MFPacketType;
import RPower.api.power.I_MFSink;
import RPower.api.power.MFPacket;
import RPower.api.power.cable.I_MFCable;
import net.RPower.RPowermod.machines.power.MFHelper;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFluxCable extends TileEntity implements I_MFCable {
	//Connections are an array of [Up, Down, North, East, West, South]
	public boolean[] connections = {false, false, false, false, false, false};

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
		int[] connectionsInt = new int[6];
		int i = 0;
		for (boolean side : connections) {
			connectionsInt[i]=connections[i]?1:0;
			i++;
		}
		nbtTag.setIntArray("connections", connectionsInt);
		nbtTag.setBoolean("insulated", insulatedCable);
		nbtTag.setBoolean("bridged", bridgeConnections);

		nbtTag.setDouble("packetLimit", packetSizeLimit);

		super.writeToNBT(nbtTag);
	};

	@Override
	public void readFromNBT(NBTTagCompound nbtTag) {
		int[] connectionsInt = nbtTag.getIntArray("connections");
		int i = 0;
		for (boolean side : connections) {
			connections[i]=(connectionsInt[i]==1);
			i++;
		}

		insulatedCable=nbtTag.getBoolean("insulated");

		bridgeConnections=nbtTag.getBoolean("bridged");

		packetSizeLimit=nbtTag.getDouble("packetLimit");

		checkLoss(insulatedCable);

		super.readFromNBT(nbtTag);
	};

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
				packet.getOrigin().add(randDir(direction));
				result=pushPacket(packet);
				break;
			}
		}
		super.updateEntity();
	}

	private byte randDir(byte initDirection) {
		byte result = -1;
		while((connectionNum()>=2)&&(result==-1||!connections[result])&&result!=initDirection)
		{
			result=(byte)(Math.random()*5);
		}
		return result;
	}

	public byte connectionNum() {
		byte result=0;
		for (Boolean connection : connections) {
			if(connection)
				result++;
		}
		return result;
	}


	public boolean checkConnections()
	{
		boolean result=false;

		int xDir=0, yDir=0, zDir=0;
		for(int dir=0; dir<=5; dir++)
		{
			int modifier=(dir%2==1)?1:-1;
			System.err.println("test vars: dir="+dir+", TestCase="+(dir/2)+", modifier="+modifier+",");
			switch(dir/2)
			{
			case 2:
				xDir=modifier;
				break;
			case 1:
				zDir=modifier;
				break;
			case 0:
				yDir=modifier;
				break;
			}
			System.out.println("testing ["+xDir+","+yDir+","+zDir+"]");
			result = this.worldObj.getBlock(xCoord+xDir, yCoord+yDir, zCoord+zDir).hasTileEntity(0);
			if(result)
				result = MFHelper.checkConnectable(this.worldObj.getTileEntity(xCoord+xDir, yCoord+yDir, zCoord+zDir));	

			System.out.println("result of MF test was: "+result);

			int conDir = dir-modifier;
			System.err.println("conDir="+conDir);
			connections[conDir]=result;

			if(connections[conDir])
			{
				System.out.println("Connection found!");
			}


		}
		worldObj.notifyBlockChange(xCoord, yCoord, zCoord, worldObj.getBlock(xCoord, yCoord, zCoord));
		return result;
	}

	@Override
	public boolean pushPacket(MFPacket packet)
	{

		byte direction = packet.getOrigin().peek();
		if(packet.getType()==E_MFPacketType.RESPOND)
			packet.getOrigin().pop();

		boolean result= false;
		int xDir=0, yDir=0, zDir=0;
		int modifier=(direction%2==1)?-1:1;
		//up:1, down:0, x+:5, x-:4, z+:3,z-2;
		switch(direction/2)
		{
		case 2:
			xDir=modifier;
			break;
		case 1:
			zDir=modifier;
			break;
		case 0:
			yDir=modifier;
			break;
		}
		result = this.worldObj.getBlock(xCoord+xDir, yCoord+yDir, zCoord+zDir).hasTileEntity(0);
		if(result)
			result=this.worldObj.getTileEntity(xCoord+xDir, yCoord+yDir, zCoord+zDir)instanceof I_MFSink;
		if(result)
			result=((I_MFSink)this.worldObj.getTileEntity(xCoord+xDir, yCoord+yDir, zCoord+zDir)).takePacket(packet);
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
	public boolean[] getConnections() {
		return connections;
	}

}
