package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ValidateUserTest {

    @Test
    public void firstNameHappy() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertTrue(validateUser.isValidatefName("Kommu"));
    }

    @Test
    public void firstNameSad() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertFalse(validateUser.isValidatefName("kommu"));
    }

    @Test
    public void phoneNumHappy() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertTrue(validateUser.isValidatePhoneNum("91 9010626122"));

    }

    @Test
    public void phoneNumSad() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertFalse(validateUser.isValidatePhoneNum("9010626122"));
    }

    @Test
    public void passwordHappy() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertTrue(validateUser.isValidatePwd("Bhagavandas2@"));
    }

    @Test
    public void passwordSad() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertTrue(validateUser.isValidatePwd("hagavandas"));
    }

    @Test
    public void emailHappy() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertTrue(validateUser.isValidateEmail("das.xyz@bl.co.in"));

    }

    @Test
    public void emailSad() {
        ValidateUser validateUser = new ValidateUser();
        Assert.assertFalse(validateUser.isValidateEmail("dasxyz@bl.co.in"));

    }


}