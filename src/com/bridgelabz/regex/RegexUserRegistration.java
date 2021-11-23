package com.bridgelabz.regex;

import java.util.Scanner;

public class RegexUserRegistration {

    Scanner sc = new Scanner(System.in);
    UserDetails userDetails = new UserDetails();

    public void userFirstName() {
        System.out.println("Enter Your First Name : ");
        String firstName = sc.nextLine();
        userDetails.firstName(firstName);
    }
    
    public void userLastName() {
    	System.out.println("Enter Your Last Name:");
    	String lastName = sc.nextLine();
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
	
	public void userPasswordrule1() {
		System.out.println("Enter password with minumum 8 characters");
		String pass1 = sc.next();
		userDetails.passwordRule1(pass1);
	}
	
	public void userPasswordrule2() {
		System.out.println("Enter password with minumum 8 characters(with atleat one uppercase)");
		String pass2 = sc.next();
		userDetails.passwordRule2(pass2);
	}

	public void userPasswordrule3() {
		System.out.println("Enter password with minumum 8 characters(with atleat one digit)");
		String pass3 = sc.next();
		userDetails.passwordRule3(pass3);
	}
	
	public void userPasswordrule4() {
		System.out.println("Enter password with minumum 8 characters(with atleat one special symbol)");
		String pass4 = sc.next();
		userDetails.passwordRule4(pass4);
	}
}