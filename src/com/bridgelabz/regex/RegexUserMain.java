package com.bridgelabz.regex;

import java.util.Scanner;

public class RegexUserMain {

	UserDetails user = new UserDetails();
	RegexUserRegistration regexUserRegistration = new RegexUserRegistration();
	Scanner sc = new Scanner(System.in);
	static final int EXIT_VALUE = 3;

	public void choice() throws Exception {
		while (true) {
			System.out.println("Enter 1 To Check First Name\n" + 
								"Enter 2 To Check Last Name\n"+
								"Enter 3 to Check email id\n"+ 
								"Enter 4 to check Mobile Number\n"+
								"Enter 5 to check password rule1\n"+
								"Enter 6 to check password rule2\n"+
								"Enter 7 to check password rule3\n"+
								"Enter 8 to check password rule4\n"+
								"Enter 9 to check different mails\n"+
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
				case 4:
					regexUserRegistration.userMobielNumber();
					break;
				case 5:
					regexUserRegistration.userPasswordrule1();
					break;
				case 6:
					regexUserRegistration.userPasswordrule2();
					break;
				case 7:
					regexUserRegistration.userPasswordrule3();
					break;
				case 8:
					regexUserRegistration.userPasswordrule4();
					break;
				case 9:
					regexUserRegistration.mailCheckker();;
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

	public static void main(String[] args) throws Exception {
		System.out.println("\n Welcome to the User Registration program by Regex \n");
		RegexUserMain regexUserMain = new RegexUserMain();
		regexUserMain.choice();
		regexUserMain.sc.close();
		
	}
}
