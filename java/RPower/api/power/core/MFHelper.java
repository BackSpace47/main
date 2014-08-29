package RPower.api.power.core;

import java.util.List;

import RPower.api.power.block.I_MFSink;
import RPower.api.power.block.I_MFSource;
import RPower.api.power.block.cable.I_MFCable;
import RPower.api.power.block.cable.I_PipeDirection;
import net.RPower.RPowermod.machines.power.cable.PipeDirection;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MFHelper {
	

	public static synchronized boolean checkConnectable(TileEntity tileEntity) {
		boolean result = (tileEntity instanceof I_MFSink || tileEntity instanceof I_MFSource);
		return result;
	}
	
	public synchronized void formConnection(World world, int[] origin, int[] target) {
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
	
	public static synchronized boolean breakConnection(World world, int[] origin, int[] target)
	{
		boolean result = false;
		result=(world.blockExists(origin[0], origin[1], origin[2]));
		if(result)
			result=world.getBlock(origin[0], origin[1], origin[2]).hasTileEntity(world.getBlock(origin[0], origin[1], origin[2]).getDamageValue(world, origin[0], origin[1], origin[2]));
		if (result)
			result=world.getTileEntity(origin[0], origin[1], origin[2])instanceof I_MFCommon;
		
		if(result)
		{
		List<I_PipeDirection> connections = ((I_MFCommon)world.getTileEntity(origin[0], origin[1], origin[2])).getConnections();
		I_PipeDirection targetConnector = new PipeDirection(target[0],target[1],target[2]);
		if(connections.contains(targetConnector))
		{
			System.out.println("Connector found...");
			System.out.println("Remove operation was "+(connections.remove(targetConnector)?"":"un")+"successful.");
		}
		if (twoWay&&(world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]))instanceof I_MFCable)
		{
		I_MFCable targetTile = (I_MFCable)world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]);
		breakConnection(false,-target[0], -target[1], -target[2]);
		((TileEntity)targetTile).updateContainingBlockInfo();
		world.markBlockForUpdate(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]);
		}
		world.getTileEntity(origin[0], origin[1], origin[2]).updateContainingBlockInfo();
		world.markBlockForUpdate(origin[0], origin[1], origin[2]);
		}
		return result;
	}
	
	public static void breakAllConnections(World world, int[] origin)
	{
		boolean result = false;
		result=(world.blockExists(origin[0], origin[1], origin[2]));
		if(result)
			result=world.getBlock(origin[0], origin[1], origin[2]).hasTileEntity(world.getBlock(origin[0], origin[1], origin[2]).getDamageValue(world, origin[0], origin[1], origin[2]));
		if (result)
			result=world.getTileEntity(origin[0], origin[1], origin[2])instanceof I_MFCommon;
		
		if(result)
		{
			I_PipeDirection[] allConnections = (I_PipeDirection[]) ((I_MFCommon)world.getTileEntity(origin[0], origin[1], origin[2])).getConnections().toArray();
			for (I_PipeDirection pipeDirection : allConnections) {
				breakConnection(world, origin, pipeDirection.getTarget());
			}
		}
	}

	public static void checkConnections(World world, int[] origin) {
		// TODO Auto-generated method stub
		
	}
	
}
