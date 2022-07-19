package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentTwenty {
    public static void main(String[] args) {
        AssignmentTwenty pattern = new AssignmentTwenty();
        pattern.firstName();
        pattern.lastName();
        pattern.email();
        pattern.mobile();
        pattern.passWord();

    }
    public static void firstName() {
        System.out.println("=== First Name ====");
        Pattern pattern1 = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher1 = pattern1.matcher("Aditya");
        if (matcher1.find())
            System.out.println("valid Name");
        else
            System.out.println("invalid Name");
    }

    public static void lastName() {
        System.out.println("=== Last Name ====");
        Pattern pattern2 = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher2 = pattern2.matcher("Motewar");
        if (matcher2.find())
            System.out.println("valid Name");
        else
            System.out.println("invalid Name");
    }
    public static void email() {
        System.out.println("=== Email ====");
        Pattern pattern3 = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher3 = pattern3.matcher("motewaraditya77@gmail.com");
        if (matcher3.find())
            System.out.println("valid Email");
        else
            System.out.println("invalid Email");
    }
    public static void mobile() {
        System.out.println("=== pre-defined-Mobile-Number ====");
        Pattern pattern4 = Pattern.compile("^(91 )[0-9]{10}$");
        Matcher matcher4 = pattern4.matcher("91 7757934629");
        if (matcher4.find())
            System.out.println("valid Mobile Number");
        else
            System.out.println("invalid Mobile Number");
    }
    public static void passWord() {
        System.out.println("=== password ====");
        Pattern pattern5 = Pattern.compile("^[A-Za-z0-9+@]{8,}$");
        Matcher matcher5 = pattern5.matcher("Abhishek@99");
        if (matcher5.find())
            System.out.println("valid Password");
        else
            System.out.println("invalid Password");
    }

}
