package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

	//testing the given input is true or not using assertions
	@Test
	public void validFirstName() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validFirstName("Kommu"));

	}

	//testing the given input is true or not using assertions
	@Test
	public void validLastName() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validLastName("Kommu"));

	}


//testing the given input is true or not using assertions
	@Test
	public void validEmail() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validMobileNum() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validPasswordRule2() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validPasswordRule2("Bhagavandas"));
	}


	//testing the given input is true or not using assertions
	@Test
	public void validPasswordRule3() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validPasswordRule3("Bhagavandas2"));
	}
}