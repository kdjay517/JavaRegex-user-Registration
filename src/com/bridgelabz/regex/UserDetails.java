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
		}else
			System.out.println("InValid");
	}

	public void emailAddress(String email) {
		regex = "^[a-zA-Z0-9]{3}([.+-_0-9a-zA-Z])*@[0-9a-zA-Z]*([.][a-zA-z]+)+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		if (m.find() && m.group().equals(email)) {
			System.out.println("Valid");
		}else
			System.out.println("InValid");
	}
}
