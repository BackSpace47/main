package RPower.api.power.cable;

public class A_PipeDirection implements I_PipeDirection {
	
	protected int[] target = {0,0,0};
	
	public A_PipeDirection(int xOffset, int yOffset, int zOffset) {
		int[] targetArr= {xOffset,yOffset,zOffset};
		setTarget(targetArr);
	}
	
	public A_PipeDirection(byte b) {
		//y = b/100 (nearest whole)
		int yOffset = (byte)b/100;
		
		//remove the processed value from the byte
		b-=(100*yOffset);
		
		//x = (b/10)-1 (again, nearest whole and convert 0-> -1, 1 -> 0, 2 -> 1)
		int xOffset = (b/10)-1;
		
		//remove the processed value from the byte
		b-= (10*(xOffset+1));
		
		//z = b-1 (converting 0-> -1, 1 -> 0, 2 -> 1)
		int zOffset = b-1;
		
		int[] targetArr= {xOffset,yOffset,zOffset};
		setTarget(targetArr);
	}

	@Override
	public void setTarget(int[] target) {
		this.target = target;
		
	}
	
	@Override
	public int[] getTarget() {
		return target;
	}

	@Override
	public byte toByte() {
		//=(100*y)+(10*(x+1))+(z+1)
		byte result = (byte) ((100*target[1]) + (10*(1+target[0])) + (1+target[2]));
		return result;
	}

}
