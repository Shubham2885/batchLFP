package batchlft86.batchlft86;

public class TempConversion {

	public static double celToFar(double cel) {
		double result =  (cel * (double)9/(double)5) + 32;
		return result;
	}
	
	public static double farToCel(double far) {
		double result = ((far -32)*((double)5/(double)9));
		return result;
	}
}
