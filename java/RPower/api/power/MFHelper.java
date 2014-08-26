package RPower.api.power;

import RPower.api.power.cable.I_MFCable;
import RPower.api.power.cable.I_PipeDirection;
import net.RPower.RPowermod.machines.power.cable.PipeDirection;
import net.RPower.RPowermod.machines.power.cable.TileEntityFluxCable;
import net.minecraft.tileentity.TileEntity;

public class MFHelper {
	

	public static synchronized boolean checkConnectable(TileEntity tileEntity) {
		boolean result = (tileEntity instanceof I_MFSink || tileEntity instanceof I_MFSource);
		return result;
	}
	
}
