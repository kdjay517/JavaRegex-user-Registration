package test.com.bridgelabz.junituser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public String regex;
	
	public boolean userFirstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		return (m.find() && m.group().equals(firstName));			
	}
	
	public boolean userLastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		return (m.find() && m.group().equals(lastName));
	}
	
	public boolean useremailAddress(String email) {
		regex = "^[A-Za-z0-9]+([.+-_][0-9a-zA-Z])*[@]([0-9a-zA-Z])+[.][a-zA-z]{2,3}([.][a-zA-z]{2,3})?$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return (m.find() && m.group().equals(email));
	}
	
	public boolean userMobileNumber(String number) {
		regex = "^([+])?[91]{2}[\\s]?[6-9][0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(number);
		return (m.find() && m.group().equals(number));
	}
	
	public boolean userPassword1(String password) {
		regex = "[a-z]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return (m.find() && m.group().equals(password));
	}
	
	public boolean userPassword2(String password) {
		regex = "(?=.*[A-Z])[A-Za-z]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return (m.find() && m.group().equals(password));
	}
	
	public boolean userPassword3(String password) {
		regex = "(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return (m.find() && m.group().equals(password));
	}
	
	public boolean userPassword4(String password) {
		regex = "(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])[a-zA-Z0-9!@#&()–[{}]:;',?/*~$^+=<>].{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return (m.find() && m.group().equals(password));
	}
}
