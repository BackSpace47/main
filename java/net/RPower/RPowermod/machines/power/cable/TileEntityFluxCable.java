package net.RPower.RPowermod.machines.power.cable;

import java.util.Stack;

import net.RPower.RPowermod.machines.power.I_MFSink;
import net.RPower.RPowermod.machines.power.MFPacket;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFluxCable extends TileEntity implements I_MFCable {
	//Connections are an array of [North, East, West, South, Up, Down]
	public Boolean[] connections = {false, false, false, false, false, false};
	
	public float packetSizeLimit;
	public float internalBuffer;
	
	public TileEntityFluxCable()
	{
		this(32);
	}
	
	public TileEntityFluxCable(int packetSize)
	{
		internalBuffer=0F;
	}
	
	public boolean takePacket(MFPacket packet)
	{
		byte direction = packet.packetOrigin.peek();
		return direction!=-1;
	}
	public boolean pushPacket(MFPacket packet)
	{
		byte direction = packet.packetOrigin.pop();
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
	
}
