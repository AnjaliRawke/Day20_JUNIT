package com.bridgelabz;

@FunctionalInterface
public interface ValidateMobileNumber {
	public  boolean validateMobileNumber(String mobileNumber) throws InvalidUserException;
}
