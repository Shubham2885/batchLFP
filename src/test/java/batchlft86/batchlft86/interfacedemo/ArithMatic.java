package batchlft86.batchlft86.interfacedemo;

public class ArithMatic implements IArithMatic{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int mul(int x, int y) {
		return x*y;
	}

//	@Override
//	public int sub(int x, int y) {
//		return x-y;
//	}

	@Override
	public int div(int x, int y) {
		return x/y;
	}

	@Override
	public int mod(int x, int y) {
		return x%y;
	}

	@Override
	public int mulBy5(int x) {
		return x*5;
	}

}
