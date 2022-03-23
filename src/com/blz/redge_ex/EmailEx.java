package com.blz.redge_ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailEx {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Email pattern program");
        String email="abc@bridgelabz.co";
        String regex="^[a-z]+@[a-z]+.[a-z]{2,3}$";
        //creating objects of pattern and matcher.
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
            System.out.println("email is valid! \nAs mandatory parts abc,@,BridgeLabz,'.',and co matches with regex pattern");
        else
            System.out.println("email is invalid! \nAs mandatory parts abc,@,BridgeLabz,'.',and co doesn't matches with regex pattern");
    }

}
