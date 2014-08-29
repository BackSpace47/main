package RPower.api.power.core;

import java.util.List;

import RPower.api.power.block.cable.I_PipeDirection;

public interface I_MFCommon {
	public List<I_PipeDirection> getConnections();
	boolean checkConnections();
}
