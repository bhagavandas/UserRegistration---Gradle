package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUser {
    final String firstName = "^[A-Z]{1}[a-z]{3,}$";

    final String email = "[a-z]{3,}(.+)?[a-z](@)?[bl+](.+)[co+](.+)[a-z]{2}$";
    final String phoneNum = "[0-9]{2}\\s{0,1}[0-9]{10}$";
    final String password = "^[A-Z]{1}[a-z]{8,}[0-9]{1,}(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).$";

    public boolean isValidatefName(String name) {

        Pattern pattern = Pattern.compile(firstName);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean isValidateEmail(String email) {

        Pattern pattern = Pattern.compile(email);
        Matcher match = pattern.matcher(email);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean isValidatePhoneNum(String phone) {

        Pattern pattern = Pattern.compile(phoneNum);
        Matcher match = pattern.matcher(phone);
        System.out.println(match.matches());
        return match.matches();
    }

    public boolean isValidatePwd(String password) {

        Pattern pattern = Pattern.compile(password);
        Matcher match = pattern.matcher(password);
        System.out.println(match.matches());
        return match.matches();
    }

}
