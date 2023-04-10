package com.bridgelabz;

@FunctionalInterface
public interface ValidateFirstName {
	public  boolean validateFirstName(String firstName) throws InvalidUserException;
}
