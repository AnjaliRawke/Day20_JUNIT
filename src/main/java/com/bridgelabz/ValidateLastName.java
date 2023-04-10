package com.bridgelabz;

@FunctionalInterface
public interface ValidateLastName {
	public  boolean validateLastName(String lastName) throws InvalidUserException;
}
