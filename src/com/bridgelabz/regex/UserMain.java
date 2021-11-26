package com.bridgelabz.regex;

public class UserMain {

	public static void main(String[] args) throws Exception {
		System.out.println("\n Welcome to the User Registration program by Regex \n");
		UserRegistration userDetails = new UserRegistration();
		userDetails.userFirstName();
		userDetails.userLastName();
		userDetails.useremailAddress();
		userDetails.userMobielNumber();
		userDetails.userPassword();
		userDetails.mailCheckker();
	}
}
