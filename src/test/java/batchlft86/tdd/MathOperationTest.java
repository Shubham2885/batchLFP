package batchlft86.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathOperationTest {

	MathOperation mathOperation;
	
	@Before
	public void setUp() {
		System.out.println("Before called");
		mathOperation = new MathOperation();
	}
	
	@Test
	public void isMathOperationClassAvailableTest() {
		assertNotNull(mathOperation);
	}
	
	@Test
	public void doAdditionTest() {
		System.out.println("Do Operation");
		assertEquals(10, mathOperation.doAddition(5,5));
	}
	
	@Test
	public void doAdditionTestFail() {
		assertEquals(11, mathOperation.doAddition(5,5));
	}
	
	@After
	public void closedAllThings() {
		System.out.println("After called");
	}
}
