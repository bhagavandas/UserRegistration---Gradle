package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
	@Test
	public void validFirstName() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validFirstName("Kommu"));

	}

	@Test
	public void validLastName() {
		UserRegistration userRegistration = new UserRegistration();
		Assert.assertTrue(userRegistration.validLastName("Bhagavan"));
	}
}