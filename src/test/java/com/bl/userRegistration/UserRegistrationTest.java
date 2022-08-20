package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

	//testing the given input is true or not using assertions
	@Test
	public void validFirstName() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidFirstName("Kommu"));

	}

	//testing the given input is true or not using assertions
	@Test
	public void validLastName() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidLastName("Kommu"));

	}


//testing the given input is true or not using assertions
	@Test
	public void validEmail() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidEmail("abc.xyz@bl.co.in"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validMobileNum() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidMobileNum("91 9010626122"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validPassword() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidPassword("bhagavandas"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validPasswordRule2() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidPasswordRule2("Bhagavandas"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validPasswordRule3() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidPasswordRule3("Bhagavandas2"));
	}

	//testing the given input is true or not using assertions
	@Test
	public void validPasswordRule4() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidPasswordRule4("Bhagavandas2@"));
	}

	//testing the given input is true or not using assertions
	@Test
	public void validemailSamples() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.isvalidemailSamples("abc@yahoo.com"));
	}
}