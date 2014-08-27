package RPower.api.power;

import java.util.List;

import RPower.api.power.cable.I_PipeDirection;


public interface I_MFSink {
	
	public boolean takePacket(MFPacket packet);
	public double flowLimit();
	public void powerBleed(double excess);
	public List<I_PipeDirection> getConnections();
	public void formConnection(boolean twoWay, int x, int y, int z);
	public void breakConnection(boolean twoWay, int x, int y, int z);
	public void breakAllConnections();

}
