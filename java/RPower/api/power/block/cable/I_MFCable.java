package RPower.api.power.block.cable;

import java.util.List;

import RPower.api.power.block.I_MFSink;
import RPower.api.power.block.I_MFSource;

public interface I_MFCable extends I_MFSink, I_MFSource{
	public double getPacketLimit();
	public boolean isInsulated();
	public boolean isBridged();
	public boolean canDeBridge();
	
}
