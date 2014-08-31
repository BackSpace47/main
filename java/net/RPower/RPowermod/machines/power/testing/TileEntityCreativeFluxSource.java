package net.RPower.RPowermod.machines.power.testing;

import java.util.LinkedList;
import java.util.List;

import net.RPower.RPowermod.machines.power.cable.PipeDirection;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import RPower.api.power.block.I_MFSink;
import RPower.api.power.block.I_MFSource;
import RPower.api.power.block.cable.I_MFCable;
import RPower.api.power.block.cable.I_PipeDirection;
import RPower.api.power.core.E_MFPacketType;
import RPower.api.power.core.MFHelper;
import RPower.api.power.core.MFPacket;

public class TileEntityCreativeFluxSource extends TileEntity implements I_MFSource, I_MFSink {
	List<I_PipeDirection> connections;
	
	public TileEntityCreativeFluxSource() {
		connections = new LinkedList<I_PipeDirection>();
	}

	@Override
	public boolean takePacket(MFPacket packet) {
		boolean result = false;
		if(packet.getType()==E_MFPacketType.REQUEST)
		{
			packet.setType(E_MFPacketType.RESPOND);
			packet.setBuffer((double) 64);
			result=pushPacket(packet);
		}
		return result;
	}

	@Override
	public boolean pushPacket(MFPacket packet) {
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
	public double flowLimit() {
		return (double)64;
	}

	@Override
	public void powerBleed(double excess) {
		//creative source will just send out another packet
	}

	

	
	@Override
	public List<I_PipeDirection> getConnections() {
		// TODO Auto-generated method stub
		return connections;
	}

	@Override
	public boolean checkConnections() {
		int[] origin = {xCoord,yCoord,zCoord};
		return MFHelper.checkConnections(worldObj, origin);
	}
	

	

}
