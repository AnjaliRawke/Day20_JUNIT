package com.bridgelabz;

@FunctionalInterface
public interface ValidateEmailId {
	public boolean validateEmailId(String emailId) throws InvalidUserException;
}
