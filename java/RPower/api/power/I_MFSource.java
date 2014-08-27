package RPower.api.power;

import java.util.List;

import RPower.api.power.cable.I_PipeDirection;


public interface I_MFSource {
	public boolean pushPacket(MFPacket packet);
	public List<I_PipeDirection> getConnections();
	public void formConnection(boolean twoWay, int x, int y, int z);
	public void breakConnection(boolean twoWay, int x, int y, int z);
	public void breakAllConnections();
	boolean checkConnections();
}
