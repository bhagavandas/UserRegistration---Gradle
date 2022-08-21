package com.bl.userRegistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    final String email;
    private final boolean expectedResult;
    //private  EmailValidation emailValidation = new EmailValidation();


    public EmailValidationTest(String email, boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        EmailValidation emailValidation = new EmailValidation();

    }
    @Parameterized.Parameters
    public static Collection email(){
        return Arrays.asList(new Object[][]{
            {"abc@yahoo.com", true},{"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true},
            {"abc111@abc.com", true},{"abc.100@abc.com.au", true}, {"abc123@.com", false},
            {"abc..2002@gmail.com", false} } );

    }
    //testing the given input is true or not using assertions
    @Test
    public void validateSamples() {
        EmailValidation emailValidation = new EmailValidation();
        Assert.assertEquals(expectedResult, emailValidation.validateSampleEmails(email));
    }

}