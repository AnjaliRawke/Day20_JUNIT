package com.bridgelabz;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {

	UserRegistration userRegistration ;
	@Before
	public void initialize(){
		userRegistration = new UserRegistration();
	}
		String emailId;
		public UserRegistrationTest(String emailId){
			super();
			this.emailId = emailId;
		}
	@Test
	public void firstNameTest() throws InvalidUserException {
		boolean firstName = userRegistration.checkFirstName("Anjali");
		Assert.assertEquals(true,firstName);
	}

	@Test
	public void LastNameTest() throws InvalidUserException {
		boolean lastName = userRegistration.checkLastName("Rawke");
		Assert.assertTrue(lastName);
	}

	@Test
	public void phoneNumberTest() throws InvalidUserException {
		boolean phoneNumber = userRegistration.checkMobileNumber("917058162286");
		Assert.assertTrue(phoneNumber);
	}

	@Test
	public void passwordTest() throws InvalidUserException {
		boolean password = userRegistration.checkPassword("Anjali@21");
		Assert.assertTrue(password);
	}

	@Test
	public void emailTest() throws InvalidUserException {
		boolean email = userRegistration.checkEmail("anjalirawke21@gmail.com");
		Assert.assertTrue(email);
	}

	@Parameterized.Parameters
	public static Collection input(){
		return Arrays.asList( new String[] {"abc@yahoo.com","abc.100@abc.com.au","abc@1.com","abc+100@gmail.com","abc.100@yahoo.com","abc-100@abc.net","abc-100@yahoo.com","abc111@abc.com"});
	}
	@Test
	public void checkEmailWithMultipleInputs() throws InvalidUserException {
			Assert.assertEquals(true,userRegistration.checkEmail(emailId));
	}
}