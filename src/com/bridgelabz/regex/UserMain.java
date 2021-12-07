package com.bridgelabz.regex;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to the User Registration program by Regex");
		UserRegistration userDetails = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("First Name:");
		String firstName = sc.nextLine(); 
		userDetails.userFirstName(firstName);
		System.out.println("Second Name:");
		String lastName = sc.nextLine();
		userDetails.userLastName(lastName);
		System.out.println("Email Address:");
		String eMail = sc.nextLine();
		userDetails.useremailAddress(eMail);
		System.out.println("Mobile Number:");
		String mobileNumber = sc.nextLine();
		userDetails.userMobileNumber(mobileNumber);
		System.out.println("Password:");
		String password = sc.nextLine();
		userDetails.userPassword(password);
	}
}
