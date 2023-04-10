package com.bridgelabz;

@FunctionalInterface
public interface ValidatePassword {
	public  boolean validatePassword(String password) throws InvalidUserException;
}
