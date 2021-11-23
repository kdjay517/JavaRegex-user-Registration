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

	public void useremailAddress() {
		System.out.println("Enter Your Mail Address");
		String mail = sc.next();
		userDetails.emailAddress(mail);
	}

	public void userMobielNumber() {
		System.out.println("Enter your Mobiel Number");
		String number = sc.nextLine();
		userDetails.mobileNumber(number);
	}
}