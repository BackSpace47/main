package net.RPower.RPowermod.machines.power.cable;

import java.util.Stack;

import RPower.api.power.E_MFPacketType;
import RPower.api.power.I_MFSink;
import RPower.api.power.MFPacket;
import RPower.api.power.cable.I_MFCable;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFluxCable extends TileEntity implements I_MFCable {
	//Connections are an array of [North, East, West, South, Up, Down]
	public Boolean[] connections = {false, false, false, false, false, false};
	
	public double packetSizeLimit;
	public int internalBuffer;
	
	public TileEntityFluxCable()
	{
		this(32);
	}
	
	public TileEntityFluxCable(double packetSize)
	{
		internalBuffer=0;
		packetSizeLimit= packetSize;
	}
	
	public boolean takePacket(MFPacket packet)
	{
		boolean result=false;
		byte  direction;
		for(int i=0; i<59;i++)
		{
			double randXvel=Math.random()*(59-i);
			double randYvel=Math.random()*(59-i);
			double randZvel=Math.random()*(59-i);
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
		return result;
	}
	
	
	private byte randDir(byte initDirection) {
		byte result = -1;
		while((connectionNum()>=2)&&(result==-1||!connections[result])&&result!=initDirection)
		{
			result=(byte)(Math.random()*5);
		}
		return result;
	}

	private byte connectionNum() {
		byte result=0;
		for (Boolean connection : connections) {
			if(connection)
				result++;
		}
		return result;
	}

	public boolean pushPacket(MFPacket packet)
	{
		byte direction = packet.getOrigin().pop();
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
		return result;
	}
	
	@Override
	public boolean canUpdate()
	{
		return false;
	}

	@Override
	public double flowLimit() {
		return packetSizeLimit;
	}

	@Override
	public void powerBleed(double excess) {
		//add power bleed to chunk atmosphere -> own effects + taint if Thaumcraft installed
		
	}
	
}
