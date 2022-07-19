package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentTwenty {
    public static void main(String[] args) {
        AssignmentTwenty pattern = new AssignmentTwenty();
        pattern.firstName();
        pattern.lastName();
        pattern.email();

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

}
