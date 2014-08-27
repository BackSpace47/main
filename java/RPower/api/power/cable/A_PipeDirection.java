package RPower.api.power.cable;

import net.RPower.RPowermod.machines.power.cable.PipeDirection;

public abstract class A_PipeDirection implements I_PipeDirection {
	
	protected int[] target = {0,0,0};
	
	public A_PipeDirection(int xOffset, int yOffset, int zOffset) {
		int[] targetArr= {xOffset,yOffset,zOffset};
		setTarget(targetArr);
	}
	
	//TODO: Solve why connections of Y= 1, X&Z=0 evaluate to -89 instead of 111.
	
	public A_PipeDirection(byte b) {
		//System.out.println("["+b+"]");
		//y = b/100 (nearest whole)
		int yOffset = (byte)b/100;
		//System.out.println(b+" yO:"+yOffset);
		
		//remove the processed value from the byte
		b-=(100*yOffset);
		//System.out.println(" "+b);
		if(b<0)
			b*=-1;
		//x = (b/10)-1 (again, nearest whole and convert 0-> -1, 1 -> 0, 2 -> 1)
		int xOffset = (b/10)-1;
		//System.out.println(b+" xO:"+xOffset);
		//remove the processed value from the byte
		b-= (10*(xOffset+1));
		//System.out.println(" "+b);
		//z = b-1 (converting 0-> -1, 1 -> 0, 2 -> 1)
		int zOffset = b-1;
		//System.out.println(b+" zO:"+zOffset);
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
		byte modifier = (byte) (target[1]<0?-1:1);
		//=(100*y)+(10*(x+1))+(z+1)
		byte xRef = (byte) ((modifier*10)*(1+target[0]));
		//System.out.println("Byte xRef:"+xRef);
		byte yRef = (byte) (100*target[1]);
		//System.out.println("Byte yRef:"+yRef);
		byte zRef =  (byte)(modifier*(1+target[2]));
		//System.out.println("Byte zRef:"+zRef);
		byte result = (byte) (zRef+xRef+yRef);
		return result;
	}

	@Override
	public String toJSON() {
		String result = "\n{";
		result+=("\n\t\"targetX\":\""+target[0]+"\",");
		result+=("\n\t\"targetY\":\""+target[1]+"\",");
		result+=("\n\t\"targetZ\":\""+target[2]+"\"");
		result+="\n}\n";
		return result;
	}
	
	@Override
	public void invert() {
		int[] newTarget = {-target[0],-target[1],-target[2]};
		target = newTarget;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj==null||!(obj instanceof I_PipeDirection))
			return false;
		return ((I_PipeDirection)obj).toByte()==this.toByte();
	}
}
