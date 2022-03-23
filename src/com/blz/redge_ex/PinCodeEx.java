package com.blz.redge_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeEx {

    public static void main(String[] args) {
        System.out.println("Welcome to Regex pinCode pattern program");
        String pinCode = "400088";
        String regex = "^[0-9]{6}$";
        //creating pattern and matcher objects
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);
        if(matcher.matches())
        System.out.println("PinCode is Valid");
        else
            System.out.println("PinCode is Invalid");
    }
}
