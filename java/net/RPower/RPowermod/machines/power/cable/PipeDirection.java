package net.RPower.RPowermod.machines.power.cable;

public interface PipeDirection {
	
	public int[] getTarget(int[] origin);
	
	public float[] getAngle();
	
	public byte toByte();
	
	public int[] getModifier();
	
	public PipeDirection fromByte(byte value);

}
