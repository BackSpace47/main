package RPower.api.power.block.cable;

public interface I_PipeDirection {
	
	public void setTarget(int[] target);
	
	public int[] getTarget();
	
	public byte toByte();
	
	public String toJSON();

	void invert();

}
