package RPower.api.power.core;

import java.util.List;

import RPower.api.power.block.cable.I_PipeDirection;

public interface I_MFCommon {
	public List<I_PipeDirection> getConnections();
	public void formConnection(boolean twoWay, int x, int y, int z);
	public void breakConnection(boolean twoWay, int x, int y, int z);
	public void breakAllConnections();
	boolean checkConnections();
}
