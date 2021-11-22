package com.bridgelabz.regex;

import java.util.Scanner;

public class RegexUserRegistration {

    Scanner sc = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = sc.next();
        userDetails.firstName(firstName);
    }
    
    public void userLastName() {
    	System.out.println("Enter Your Last Name:");
    	String lastName = sc.next();
    	userDetails.lastName(lastName);
    }
}