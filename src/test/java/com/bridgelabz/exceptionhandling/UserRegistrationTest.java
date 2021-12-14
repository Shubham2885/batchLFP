package com.bridgelabz.exceptionhandling;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration user;
	@Before
	public void setup() {
		user = new UserRegistration();
	}
	
	@Test(expected = CustomException.InvalidName.class)
	public void test1() {
		user.validateName("sdfsdf");
	}
	
	@Test
	public void test2() {
		user.validateName("Sdfsdf");
	}
}
