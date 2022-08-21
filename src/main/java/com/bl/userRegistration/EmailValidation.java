package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    // validating the emails
    public boolean validateSampleEmails(String email) {
        Pattern pattern = Pattern.compile("[a-z]{3,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).[a-z](.+)[com+]$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
