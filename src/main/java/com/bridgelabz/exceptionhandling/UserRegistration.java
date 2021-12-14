package com.bridgelabz.exceptionhandling;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public void validateName(String name) throws CustomException.InvalidName {
		Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-z]{0,15}");
		Matcher matcher = pattern.matcher(name);
		
		if(!matcher.find()) {
			throw new CustomException.InvalidName("Name Should be start with Cap and length is < 15");
		}
	}

	public void vallidateMobileNo(String mobile) {
		Pattern pattern = Pattern.compile("^[0-9]{2}+[ ][0-9]{10}$");
		Matcher matcher = pattern.matcher(mobile);
		
		if(!matcher.find()) {
			throw new CustomException.InvalidMobileNumber("Invalid Mobile No");
		}
	}
}
