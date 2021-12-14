package batchlft86.junittesting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junittesting.Transaction;

public class TransactionTest {
	
	Transaction transaction;
	
	@Before
	public void setUp() {
		transaction = new Transaction();
	}

	@Test
	public void doTransactionTest() {
		boolean x = transaction.doTransaction("12345", "11111", "123");
		Assert.assertTrue(x);
	}
	
	@Test(expected = NumberFormatException.class)
	public void doTransactionTest1() {
		boolean x = transaction.doTransaction("sdfas", "11111", "123");
		Assert.assertFalse(x);
	}
	
	@Test(expected = NumberFormatException.class)
	public void doTransactionTest4() {
		boolean x = transaction.doTransaction(null, "11111", "123");
		Assert.assertFalse(x);
	}
	
	@Test
	public void doTransactionTest2() {
		boolean x = transaction.doTransactionCredit("sdfas", "11111", "123");
		Assert.assertFalse(x);
	}
	
	
	@Test
	public void doTransactionTest3() {
		Assert.assertNotNull(new Account());
		
	}
}
