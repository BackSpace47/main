package RPower.api.power.cable;

import RPower.api.power.I_MFSink;
import RPower.api.power.I_MFSource;

public interface I_MFCable extends I_MFSink, I_MFSource{
	public double getPacketLimit();
	public boolean isInsulated();
	public boolean isBridged();
	public boolean canDeBridge();
	public boolean[] getConnections();
	
	
	

}
