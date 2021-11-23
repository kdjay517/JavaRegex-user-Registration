package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDetails {
	public String regex;

	public void firstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("InValid");
		}
	}

	public void lastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		if (m.find() && m.group().equals(lastName)) {
			System.out.println("Valid");
		} else
			System.out.println("InValid");
	}

	public void emailAddress(String mail) {
		regex = "^[A-Za-z0-9]+[*-+_0-9a-zA-Z]*@[0-9a-zA-Z]*([.][a-zA-Z]+)+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mail);
		if (m.find() && m.group().equals(mail)) {
			System.out.println("Valid");
		} else
			System.out.println("InValid");
	}

	public void mobileNumber(String number) {
		regex = "^[91]{2}[\\s][6-9][0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(number);
		if (m.find() && m.group().equals(number)) {
			System.out.println("Valid");
		} else
			System.out.println("InValid");
	}

	public void passwordRule1(String pass1) {
		regex = "[a-z]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pass1);
		if (m.find() && m.group().equals(pass1)) {
			System.out.println("Valid");
		} else
			System.out.println("InValid");
	}

	public void passwordRule2(String pass2) {
		regex = "(?=.*[A-Z])[A-Za-z]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pass2);
		if (m.find() && m.group().equals(pass2)) {
			System.out.println("Valid");
		} else
			System.out.println("InValid");
	}
}
