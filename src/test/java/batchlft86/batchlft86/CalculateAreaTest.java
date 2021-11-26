package batchlft86.batchlft86;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculateAreaTest {
	private static final double DELTA = 1e-15;
	CalculateArea area;
	
	@Before
	public void setUp() {
		area = new CalculateArea();
		area.setRadius(5);
	}
	
	@Test
	public void areaTest() {
		double result = area.areaOfCircle();
		Assert.assertEquals(78.55, result, DELTA);
	}
}
