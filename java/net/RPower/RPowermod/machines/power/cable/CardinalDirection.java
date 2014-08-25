package net.RPower.RPowermod.machines.power.cable;

public enum CardinalDirection implements PipeDirection{
	N,E,W,S,U,D;

	@Override
	public int[] getTarget(int[] origin) {
		int[] result={0,0,0};
		int[] modifier = getModifier();
		for (int i=0;i<3;i++)
		{
			result[i]+=modifier[i];
		}
		return result;
	}

	public int[] getModifier() {
		int[] result={0,0,0};
		switch(this){
		case D:
			result[1]=-1;
			break;
		case E:
			result[0]=1;
			break;
		case N:
			result[2]=-1;
			break;
		case S:
			result[2]=1;
			break;
		case U:
			result[1]=1;
			break;
		case W:
			result[0]=-1;
			break;
		default:
			break;
		
		}
		return result;
	}

	@Override
	public float[] getAngle() {
		float[] result={90F,90F,90F};
		int[] modifier = getModifier();
		for (int i=0;i<3;i++)
		{
			result[i]*=modifier[i];
		}
		return result;
	}

	@Override
	public byte toByte() {
		byte result=0;
		switch (this) {
		case D:
			result=0;
			break;
		case E:
			result=5;
			break;
		case N:
			result=2;
			break;
		case S:
			result=3;
			break;
		case U:
			result=1;
			break;
		case W:
			result=4;
			break;

		}
		return result;
	}
	
	@Override
	public PipeDirection fromByte(byte value) {
		PipeDirection result = null;
		switch(value){
		case 0:
			result=D;
			break;
		case 1:
			result=U;
			break;
		case 2:
			result=N;
			break;
		case 3:
			result=S;
			break;
		case 4:
			result=W;
			break;
		case 5:
			result=E;
			break;
		}
		return result;
	}

}
