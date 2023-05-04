package com.bridgelabz.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAssignement {
    
    public void validateFirstName(){
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
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

}
