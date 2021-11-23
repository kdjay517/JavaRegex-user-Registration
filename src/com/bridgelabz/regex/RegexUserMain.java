package com.bridgelabz.regex;

import java.util.Scanner;

public class RegexUserMain {

	RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
	Scanner sc = new Scanner(System.in);
	static final int EXIT_VALUE = 3;

	public void choice() {
		while (true) {
			System.out.println("Enter 1 To Check First Name\n" + 
								"Enter 2 To Check Last Name\n"+
								"Enter 3 to Check email id\n"+ 
								"Enter 0 To Exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					regexUserRegistration.userFirstName();
					break;
				case 2:
					regexUserRegistration.userLastName();
					break;
				case 3:
					regexUserRegistration.useremailAddress();
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Enter the wrong input \n Please enter the Correct input");
					continue;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("\n Welcome to the User Registration program by Regex \n");
		RegexUserMain regexUserMain = new RegexUserMain();
		regexUserMain.choice();
		regexUserMain.sc.close();
	}
}
