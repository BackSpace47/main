package net.RPower.RPowermod.machines.power.cable;

public class CompoundDirection implements PipeDirection {
	private CardinalDirection[] directions = {null,null};
	
	public CompoundDirection(CardinalDirection direction1,CardinalDirection direction2) {
		directions[0]=direction1;
		directions[1]=direction2;
	}

	@Override
	public int[] getTarget(int[] origin)
	{
		int[] result={0,0,0};
		int[] modifier = getModifier();
			for(int i = 0;i<3;i++){
			result[i]=origin[i]+=modifier[i];
		}
		return result;
	}

	@Override
	public float[] getAngle()
	{
		float[] result= {0F,0F,0F};
		float[] angle1 = directions[0].getAngle();
		float[] angle2 = directions[1].getAngle();
		for(int i = 0;i<3;i++){
			result[i] = (angle1[i]+angle2[i])/2;
		}
		return result;
	}

	@Override
	public byte toByte() {
		byte result=(byte) ((10*directions[0].toByte())+directions[1].toByte());
		return result;
	}

	@Override
	public PipeDirection fromByte(byte value) {
		CardinalDirection temp = CardinalDirection.N;
		directions[0]= (CardinalDirection) temp.fromByte((byte)(value/10));
		directions[1]= (CardinalDirection) temp.fromByte((byte)(value-(directions[0].toByte()*10)));
		return new CompoundDirection(directions[0], directions[1])
		;
	}

	@Override
	public int[] getModifier() {
		int[] result={0,0,0};
		int[] mod1 = directions[0].getModifier();
		int[] mod2 = directions[1].getModifier();
		for(int i = 0;i<3;i++){
			result[i]=(mod1[i]+mod2[i]);
		}
		return result;
	}

}
