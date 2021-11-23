package batchlft86.batchlft86;

import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {

	@Test
	public void addTestPass() {
		int z = Utility.addition(2, 5);
		Assert.assertEquals(7, z);
	}
	
	@Test
	public void addTestFail() {
		int z = Utility.addition(2, 5);
		Assert.assertEquals(8, z);
	}
}
