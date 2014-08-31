package RPower.api.power.core;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import RPower.api.power.block.I_MFSink;
import RPower.api.power.block.I_MFSource;
import RPower.api.power.block.cable.I_MFCable;
import RPower.api.power.block.cable.I_PipeDirection;
import net.RPower.RPowermod.machines.power.cable.PipeDirection;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MFHelper {


	public static synchronized boolean checkConnectable(TileEntity tileEntity) {
		boolean result = (tileEntity instanceof I_MFSink || tileEntity instanceof I_MFSource);
		return result;
	}

	public static synchronized boolean checkConnections(World world, int[] origin)
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
					Block target = world.getBlock(origin[0]+x, origin[1]+y, origin[2]+z);
					//System.out.print("Test["+i+"] Checking block at ["+(xCoord+x)+","+(yCoord+y)+","+(zCoord+z)+"]");
					if(target.hasTileEntity(target.getDamageValue(world, origin[0]+x, origin[1]+y, origin[2]+z))&&MFHelper.checkConnectable(world.getTileEntity(origin[0]+x, origin[1]+y, origin[2]+z)))
					{
						System.out.print("["+(origin[0]+x)+","+(origin[1]+y)+","+(origin[2]+z)+"] - Valid!");
						int[] connectorTarget = {x,y,z};
						MFHelper.formConnection(world, origin, connectorTarget);

					}
					//System.out.print('\n');
				}
			}
			//System.out.println("=================================================================");
		}
		return result;
	}

	public static synchronized boolean formConnection(World world, int[] origin, int[] target)
	{
		boolean result = false;
		if(!(target[0]==0&&target[1]==0&&target[2]==0))
		{

			result=(world.blockExists(origin[0], origin[1], origin[2]));
			if(result)
				result=world.getBlock(origin[0], origin[1], origin[2]).hasTileEntity(world.getBlock(origin[0], origin[1], origin[2]).getDamageValue(world, origin[0], origin[1], origin[2]));
			if (result)
				result=world.getTileEntity(origin[0], origin[1], origin[2])instanceof I_MFCommon;
			boolean twoWay = world.getBlock(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]).hasTileEntity(world.getBlock(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]).getDamageValue(world, origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]));
			if(twoWay)
				twoWay = world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]) instanceof I_MFCommon;
			if(twoWay)
				twoWay = !((I_MFCommon)world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2])).getConnections().contains(new PipeDirection(-target[0], -target[1],-target[2]));
			if(result)
			{
				List<I_PipeDirection> connections = ((I_MFCommon)world.getTileEntity(origin[0], origin[1], origin[2])).getConnections();
				I_PipeDirection targetConnector = new PipeDirection(target[0],target[1],target[2]);
				connections.add(targetConnector);
				if (twoWay)
				{
					((I_MFCommon)world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2])).getConnections().add(new PipeDirection(-target[0], -target[1],-target[2]));

					world.markBlockForUpdate(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]);
				}
				//System.out.println("connection formed");
				world.markBlockForUpdate(origin[0], origin[1], origin[2]);

			}
		}
		return result;
	}

	public static synchronized void breakConnection(World world, int[] origin, int[] target)
	{
		boolean result = false;
		result=(world.blockExists(origin[0], origin[1], origin[2]));
		if(result)
			result=world.getBlock(origin[0], origin[1], origin[2]).hasTileEntity(world.getBlock(origin[0], origin[1], origin[2]).getDamageValue(world, origin[0], origin[1], origin[2]));
		if (result)
			result=world.getTileEntity(origin[0], origin[1], origin[2])instanceof I_MFCommon;

		if(result)
		{
			List<I_PipeDirection> connections = Collections.synchronizedList(((I_MFCommon)world.getTileEntity(origin[0], origin[1], origin[2])).getConnections());
			I_PipeDirection targetConnector = new PipeDirection(target[0],target[1],target[2]);
			if(connections.contains(targetConnector))
			{
				System.out.println("Connector found...");
				System.out.println("Remove operation was "+(connections.remove(targetConnector)?"":"un")+"successful.");
			}
			//check if the target tile has a connection to this one, if so, delete it.
			if(world.getBlock(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]).hasTileEntity(0)&& world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2])instanceof I_MFCommon)

			{I_MFCommon targetTile = (I_MFCommon)world.getTileEntity(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]);
			connections = targetTile.getConnections();
			targetConnector.invert();
			if(connections.contains(targetConnector))
				connections.remove(targetConnector);
			world.markBlockForUpdate(origin[0]+target[0], origin[1]+target[1], origin[2]+target[2]);
			}
		}
		world.markBlockForUpdate(origin[0], origin[1], origin[2]);
	}



	public static synchronized void breakAllConnections(World world, int[] origin)
	{
		boolean result = false;
		result=(world.blockExists(origin[0], origin[1], origin[2]));
		if(result)
			result=world.getBlock(origin[0], origin[1], origin[2]).hasTileEntity(world.getBlock(origin[0], origin[1], origin[2]).getDamageValue(world, origin[0], origin[1], origin[2]));
		if (result)
			result=world.getTileEntity(origin[0], origin[1], origin[2])instanceof I_MFCommon;

		if(result)
		{
			List<I_PipeDirection> allConnections = Collections.synchronizedList(((I_MFCommon)world.getTileEntity(origin[0], origin[1], origin[2])).getConnections());
			synchronized (allConnections) {
				Iterator processConnections = allConnections.iterator();
				while(processConnections.hasNext())
				{
					MFHelper.breakConnection(world, origin, ((I_PipeDirection)processConnections.next()).getTarget());
				}
			}
		}
		System.out.println("All connections to +"+world.toString()+"["+origin[0]+","+origin[1]+","+origin[2]+"] beroken");
	}

}
