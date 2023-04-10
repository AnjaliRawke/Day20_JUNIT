package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class UserRegistration {

		public static ValidateFirstName validateFirstName = (String userFirstName) -> {
			Pattern firstName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
			Matcher matcher = firstName.matcher(userFirstName);
			if (matcher.matches()) {
				return true;
			} else {
				throw new InvalidUserException("Invalid First Name");
			}
		};

		public static ValidateLastName validateLastName = (String userLastName) -> {
			Pattern lastName = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
			Matcher matcher = lastName.matcher(userLastName);
			if (matcher.matches()) {
				return true;
			} else {
				throw new InvalidUserException("Invalid Last Name");
			}
		};

		public static ValidateMobileNumber validateMobileNumber = (String userMobileNumber) -> {
			Pattern mobileNumber = Pattern.compile("^([0-9]{2,4})?[\s]?[0-9]{10}$");
			Matcher matcher = mobileNumber.matcher(userMobileNumber);
			if (matcher.matches()) {
				return true;
			} else {
				throw new InvalidUserException("Invalid Mobile Number");
			}
		};

		public static ValidatePassword validatePassword = (String userPassword) -> {
			Pattern passwordRule = Pattern.compile("^(?=.*[A-Z])(?=.*[!@#$%&*()])(?=.*[0-9])(?=\\S+$).{8,}$");
			Matcher matcher = passwordRule.matcher(userPassword);
			if (matcher.matches()) {
				return true;
			} else {
				throw new InvalidUserException("Invalid Password");
			}
		};

		public static ValidateEmailId validateEmailId = (String userEmailId) -> {
			Pattern emailPattern = Pattern.compile("^[a-z0-9]{3,}([+-._]{1}[0-9]+)?@[a-z0-9]+[.]{1}[a-z]{2,}[,]?([.]{1}[a-z]{1,})?$");
			Matcher matcher = emailPattern.matcher(userEmailId);
			if (matcher.matches()) {
				return true;
			} else {
				throw new InvalidUserException("Invalid Email ID");
			}
		};
	}