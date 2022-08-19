package com.bl.userRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
        public boolean validFirstName(String fName) {
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
               //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
               Matcher matcher = pattern.matcher(fName);
               return matcher.matches();
        }

    public boolean validLastName(String fName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(fName);
        return matcher.matches();
    }

}


