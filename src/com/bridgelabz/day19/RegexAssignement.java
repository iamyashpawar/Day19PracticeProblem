package com.bridgelabz.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssignement {

    Scanner sc = new Scanner(System.in);
    
    public void validateFirstName(){

        System.out.print("Enter your First Name: ");
        String firstName= sc.next();

        Pattern pattern = Pattern.compile("^[A-Z]{3}$");
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid First Name");
        }else {
            System.out.println("Invalid First Name");
        }
    }


    public void validateLastName() {

        System.out.print("Enter your Last Name: ");
        String lastName = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z]{3}$");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Valid Last Name");
        }else {
            System.out.println("Invalid Last Name");
        }
    }

    public void validateEmail() {

        System.out.print("Enter your Email Address: ");
        String emailAddress = sc.next();

        Pattern pattern = Pattern.compile("^[a-z]{3}\\.[a-z]?{3}\\@[b][l]\\.[co]\\.[in]?$");
        Matcher matcher =pattern.matcher(emailAddress);
        if (matcher.matches()){
            System.out.println("Valid Email Address");
        }else {
            System.out.println("Invalid Email Address");
        }


    }

    public void validateMobile() {
        System.out.print("Enter Mobile Number ");
        String mobileNumber = sc.next();
        Pattern pattern = Pattern.compile("^[9][1]\\s[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        if (matcher.matches()){
            System.out.println("Valid Mobile Number");
        }else {
            System.out.println("Invalid Number");

        }

    }
}
