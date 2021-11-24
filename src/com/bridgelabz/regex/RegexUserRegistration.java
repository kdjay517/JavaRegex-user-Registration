package com.bridgelabz.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public void mailCheckker() throws Exception {
		String regex;
		regex = "^[A-Za-z0-9]+([.+-_][0-9a-zA-Z])*[@]([0-9a-zA-Z])+[.][a-zA-z]{2,3}([.][a-zA-z]{2,3})?$";
		Pattern p = Pattern.compile(regex);
		PrintWriter pw = new PrintWriter("C:\\Users\\91897\\Desktop\\Projects\\Learning_path\\RFT_JAVA_80\\JavaRegex-user-Registration\\src\\com\\bridgelabz\\regex\\sampleidresult");
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\91897\\Desktop\\Projects\\Learning_path\\RFT_JAVA_80\\JavaRegex-user-Registration\\src\\com\\bridgelabz\\regex\\samplemails"));
		String line = br.readLine();
		while (line != null ) {
			Matcher m = p.matcher(line);
			if(m.find()) {
				pw.println(m.group()+"---->Valid");
			}
			line = br.readLine();
		}
		pw.close();
		br.close();
	}
}