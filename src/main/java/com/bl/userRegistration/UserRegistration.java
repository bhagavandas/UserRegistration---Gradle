package com.bl.userRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

// validating the first name using regex pattern
public class UserRegistration {
        public boolean validFirstName(String fName) {
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
               //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
               Matcher matcher = pattern.matcher(fName);
               return matcher.matches();
        }
// validating the last name using regex pattern
    public boolean validLastName(String fName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(fName);
        return matcher.matches();
    }

    // validating the email using regex pattern
    public boolean validEmail(String email) {
        Pattern pattern = Pattern.compile("[abc+](.+)?[a-z](@)?[bl+](.+)[co+](.+)[a-z]{2}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


}


