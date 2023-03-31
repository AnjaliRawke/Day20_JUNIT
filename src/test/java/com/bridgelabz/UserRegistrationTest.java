package com.bridgelabz;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration ;
	@Before
	public void initialize(){
		userRegistration = new UserRegistration();
	}
	@Test
	public void firstNameHappyTest(){
		boolean firstName = userRegistration.checkFirstName("Anjali");
		Assert.assertEquals(true,firstName);
	}
	@Test
	public void firstNameSadTest(){
		boolean firstName = userRegistration.checkFirstName("anjali");
		Assert.assertFalse(firstName);
	}
	@Test
	public void LastNameHappyTest(){
		boolean lastName = userRegistration.checkLastName("Rawke");
		Assert.assertTrue(lastName);
	}
	@Test
	public void LastNameSadTest(){
		boolean lastName = userRegistration.checkLastName("rawke");
		Assert.assertFalse(lastName);
	}
	@Test
	public void phoneNumberHappyTest(){
		boolean phoneNumber = userRegistration.checkMobileNumber("917058162286");
		Assert.assertTrue(phoneNumber);
	}
	@Test
	public void phoneNumberSadTest(){
		boolean phoneNumber = userRegistration.checkMobileNumber("12221 7058162286");
		Assert.assertFalse(phoneNumber);
	}
	@Test
	public void passwordHappyTest(){
		boolean password = userRegistration.checkPassword("Anjali@21");
		Assert.assertTrue(password);
	}
	@Test
	public void passwordSadTest(){
		boolean password = userRegistration.checkPassword("anjali21");
		Assert.assertFalse(password);
	}
	@Test
	public void emailHappyTest(){
		boolean email = userRegistration.checkEmail("anjalirawke21@gmail.com");
		Assert.assertTrue(email);
	}
	@Test
	public void emailSadTest(){
		boolean email = userRegistration.checkEmail("Anjali@gmail.com");
		Assert.assertFalse(email);
	}


}