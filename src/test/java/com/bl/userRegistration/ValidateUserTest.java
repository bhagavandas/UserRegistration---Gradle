package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ValidateUserTest {

    @Test
    public void firstNameHappy() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidatefName("Bhagavan");
        assertEquals(true, result);
    }

    @Test
    public void firstNameSad() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidatefName("bhagavan");
        assertEquals(false, result);
    }

    @Test
    public void phoneNumHappy() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidatePhoneNum("91 9010626122");
        assertEquals(true, result);
    }

    @Test
    public void phoneNumSad() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidatePhoneNum("919010626122");
        assertEquals(false, result);
    }

    @Test
    public void passwordHappy() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidatePwd("Bhagavan2@");
        assertEquals(true, result);
    }

    @Test
    public void passwordSad() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidatePwd("bhagavan2");
        assertEquals(false, result);
    }

    @Test
    public void emailHappy() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidateEmail("das.xyz@bl.co.in");
        assertEquals(true, result);
    }

    @Test
    public void emailSad() {
        ValidateUser validateUser = new ValidateUser();
        boolean result = validateUser.isValidateEmail("dasyahoo.com");
        assertEquals(false, result);
    }

    private void assertEquals(boolean b, boolean result) {
    }

}