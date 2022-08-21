package com.bl.userRegistration;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

// validating the first name using regex pattern
public class UserRegistration {
        public boolean isvalidFirstName(String fName) {
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
               //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
               Matcher matcher = pattern.matcher(fName);
               return matcher.matches();
        }
// validating the last name using regex pattern
    public boolean isvalidLastName(String fName) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(fName);
        return matcher.matches();
    }

    // validating the email using regex pattern
    public boolean isvalidEmail(String email) {
        Pattern pattern = Pattern.compile("[abc+](.+)?[a-z](@)?[bl+](.+)[co+](.+)[a-z]{2}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    // validating the mobile number using regex pattern that is country code followed by space and 10 digit number
    public boolean isvalidMobileNum(String mobNum) {
        Pattern pattern = Pattern.compile("[0-9]{2}\\s{0,1}[0-9]{10}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(mobNum);
        return matcher.matches();
    }

    // validating the password that has minimum 8 characters
    public boolean isvalidPassword(String pwd) {
        Pattern pattern = Pattern.compile("[a-z]{8,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }


    // validating the password that has minimum 8 characters and one uppercase
    public boolean isvalidPasswordRule2(String pwd) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{8,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }


    // validating the password that has minimum 8 characters and one uppercase and obe numeric
    public boolean isvalidPasswordRule3(String pwd) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{8,}[0-9]{1,}$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }


    // validating the password that has minimum 8 characters and one uppercase and obe numeric and one special character
    public boolean isvalidPasswordRule4(String pwd) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{8,}[0-9]{1,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }


    // validating the emails
    public boolean isvalidemailSamples(String pwd) {
        Pattern pattern = Pattern.compile("[a-z]{3,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).[a-z](.+)[com+]$");
        //Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}+$");
        Matcher matcher = pattern.matcher(pwd);
        return matcher.matches();
    }

}


