package batchlft86.batchlft86;

public class Utility {

	static int addition(int x, int y) {
		return x + y;
	}
	
	static int sub(int x, int y) {
		return x - y;
	}
	
	static int div(int x, int y) {
		if(y == 0) {
			return -1;
		}else {
			return x / y;
		}
	}
	
	static int mul(int x, int y) {
		return x * y;
	}
	
	static int modul(int x, int y) {
		return x % y;
	}
}
