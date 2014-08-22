package net.RPower.RPowermod.machines.power;

import RPower.api.power.I_MFSink;
import RPower.api.power.I_MFSource;
import RPower.api.power.cable.I_MFCable;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.minecraft.tileentity.TileEntity;

public class MFHelper {
	

	public static boolean checkConnectable(TileEntity tileEntity) {
		boolean result = (tileEntity instanceof I_MFSink || tileEntity instanceof I_MFSource);
		if (result)
			System.out.println("Success!");
		System.out.println(tileEntity.toString());
		return result;
	}

}
