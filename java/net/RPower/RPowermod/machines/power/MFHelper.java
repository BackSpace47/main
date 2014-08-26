package net.RPower.RPowermod.machines.power;

import RPower.api.power.I_MFSink;
import RPower.api.power.I_MFSource;
import RPower.api.power.cable.I_MFCable;
import net.RPower.RPowermod.machines.power.cable.CardinalDirection;
import net.RPower.RPowermod.machines.power.cable.CompoundDirection;
import net.RPower.RPowermod.machines.power.cable.PipeDirection;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.minecraft.tileentity.TileEntity;

public class MFHelper {
	

	public static synchronized boolean checkConnectable(TileEntity tileEntity) {
		boolean result = (tileEntity instanceof I_MFSink || tileEntity instanceof I_MFSource);
		if (result)
			System.out.println("Success!");
		System.out.println(tileEntity.toString());
		return result;
	}

	public static synchronized PipeDirection CheckDirection(byte b) {
		PipeDirection temp=null;
		if(b>10)
		{
			temp = new CompoundDirection(null, null).fromByte(b);
		}else{
			temp = CardinalDirection.N.fromByte(b);
		}
		return temp;
	}
	
}
