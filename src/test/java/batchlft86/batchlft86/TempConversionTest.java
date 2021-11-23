package batchlft86.batchlft86;

import org.junit.Assert;
import org.junit.Test;

public class TempConversionTest {

	private static final double DELTA = 1e-15;
	
	@Test
	public void celToFarTestPass() {
		double result = TempConversion.celToFar(1);
		Assert.assertEquals(33.8, result, DELTA);
	}
	
	@Test
	public void celToFarTestFail() {
		double result = TempConversion.celToFar(7);
		Assert.assertEquals(107, result, 1);
	}
	
	@Test
	public void farToCelTestPass() {
		double result = TempConversion.farToCel(33.8);
		Assert.assertEquals(1.0, Math.round(result), DELTA);
	}
	
	@Test
	public void farToCelTestFail() {
		double result = TempConversion.farToCel(107.0);
		Assert.assertEquals(7, Math.round(result), DELTA);
	}
}
