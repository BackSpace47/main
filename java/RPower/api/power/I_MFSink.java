package RPower.api.power;


public interface I_MFSink {
	
	public boolean takePacket(MFPacket packet);
	public double flowLimit();
	public void powerBleed(double excess);

}
