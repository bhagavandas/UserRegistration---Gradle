package com.bl.userRegistration;

import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class UserRegistration1 {
	
	 public boolean validFirstName(String fName) {
         Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
            //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
            java.util.regex.Matcher matcher = pattern.matcher(fName);
            return matcher.matches();
     }

}
