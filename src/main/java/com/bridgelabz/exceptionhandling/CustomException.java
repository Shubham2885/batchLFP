package com.bridgelabz.exceptionhandling;

public class CustomException {

	public static class InvalidName extends RuntimeException{
		public InvalidName(String message) {
			super(message);
		}
	}
	
	public static class InvalidMobileNumber extends RuntimeException{
		public InvalidMobileNumber(String message) {
			super(message);
		}
	}
}
