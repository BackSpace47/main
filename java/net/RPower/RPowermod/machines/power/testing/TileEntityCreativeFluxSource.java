package net.RPower.RPowermod.machines.power.testing;

import java.util.LinkedList;
import java.util.List;

import net.RPower.RPowermod.machines.power.cable.PipeDirection;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import RPower.api.power.E_MFPacketType;
import RPower.api.power.I_MFSink;
import RPower.api.power.I_MFSource;
import RPower.api.power.MFHelper;
import RPower.api.power.MFPacket;
import RPower.api.power.cable.I_MFCable;
import RPower.api.power.cable.I_PipeDirection;

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
	public boolean checkConnections()
	{
		boolean result=false;
		int x,y,z,i=0;
		for(y=-1;y<2;y++)
		{
			//System.out.println("Y Level: "+y);
			for(x=-1;x<2;x++)
			{
				//System.out.println("X Position: "+x);
				for(z=-1;z<2;z++)
				{
					//System.out.println("Z Position: "+z);
					i++;
					Block target = worldObj.getBlock(xCoord+x, yCoord+y, zCoord+z);
					//System.out.print("Test["+i+"] Checking block at ["+(xCoord+x)+","+(yCoord+y)+","+(zCoord+z)+"]");
					if(target.hasTileEntity(target.getDamageValue(worldObj, xCoord+x, yCoord+y, zCoord+z))&&MFHelper.checkConnectable(worldObj.getTileEntity(xCoord+x, yCoord+y, zCoord+z)))
					{
							//System.out.print(" - Valid!");
							boolean twoWay = (worldObj.getTileEntity(xCoord+x, yCoord+y, zCoord+z))instanceof I_MFCable;
							formConnection(twoWay, x,y,z);
						
					}
					//System.out.print('\n');
				}
			}
			//System.out.println("=================================================================");
		}
		return result;
	}

	
	@Override
	public List<I_PipeDirection> getConnections() {
		// TODO Auto-generated method stub
		return connections;
	}

	@Override
	public void formConnection(boolean twoWay, int x, int y, int z) {
		if(!(x==0&&y==0&&z==0))
		{
			connections.add(new PipeDirection(x, y, z));
			if (twoWay)
			{
				((I_MFCable)(worldObj.getTileEntity(xCoord+x, yCoord+y, zCoord+z))).formConnection(false, -x, -y, -z);
				
				worldObj.markBlockForUpdate(xCoord+x, yCoord+y, zCoord+z);
			}
			//System.out.println("connection formed");
			worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
		}
	}

	@Override
	public void breakConnection(boolean twoWay, int x, int y, int z) {
		if (twoWay&&(worldObj.getTileEntity(xCoord+x, yCoord+y, zCoord+z))instanceof I_MFCable)
		{
		I_MFCable targetTile = (I_MFCable)worldObj.getTileEntity(xCoord+x, yCoord+y, zCoord+z);
		targetTile.breakConnection(false,-x, -y, -z);
		worldObj.markBlockForUpdate(xCoord+x, yCoord+y, zCoord+z);
		}
		connections.remove(new PipeDirection(x,y,z));
		worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
	}

	@Override
	public void breakAllConnections() {
		int conNum=connections.size();
		for (int i= 0; i<conNum;i++) {
			int[] target = connections.get(0).getTarget();
			breakConnection(true, target[0], target[1], target[2]);
		}
		
	}

}
