package com.bridgelabz.regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);
    public String regex;

	public void userFirstName() {
		System.out.println("Enter Your First Name(with first letter capital) : ");
		while (true) {
			String firstName = sc.nextLine();
			regex = "^[A-Z]{1}[a-z]{2,}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(firstName);
			if (m.find() && m.group().equals(firstName)) {
				System.out.println("Valid");
				break;
			}
			System.out.println("InValid");
		}
	}
        
    public void userLastName() {
    	System.out.println("Enter Your Last Name(with first letter capital):");
    	while(true) {
        	String lastName = sc.nextLine();
        	regex = "^[A-Z]{1}[a-z]{2,}$";
    		Pattern p = Pattern.compile(regex);
    		Matcher m = p.matcher(lastName);
    		if (m.find() && m.group().equals(lastName)) {
    			System.out.println("Valid");
    			break;
    		}
    		System.out.println("InValid");
    	}
    }

	public void useremailAddress() {
		System.out.println("Enter Your Mail Address(format of abc.xyz@bl.co.in )");
		while(true){
			String mail = sc.nextLine();
			regex = "^[A-Za-z0-9]+([.+-_][0-9a-zA-Z])*[@]([0-9a-zA-Z])+[.][a-zA-z]{2,3}([.][a-zA-z]{2,3})?$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(mail);
			if (m.find() && m.group().equals(mail)) {
				System.out.println("Valid");
				break;
			} 
			System.out.println("InValid");
		}	
	}

	public void userMobielNumber() {
		System.out.println("Enter your Mobiel Number");
		while(true){
			String number = sc.nextLine();
			regex = "^([+])?[91]{2}[\\s]?[6-9][0-9]{9}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(number);
			if (m.find() && m.group().equals(number)) {
				System.out.println("Valid");
				break;
			} 
			System.out.println("InValid");
		}
	}
	
	public void userPassword() {
		System.out.println("Enter password with minumum 8 characters(with atleat one capital letter,digit and special symbol)");
		while(true) {
			String password = sc.nextLine();
			regex = "(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])[a-zA-Z0-9!@#&()–[{}]:;',?/*~$^+=<>].{8,}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			if (m.find() && m.group().equals(password)) {
				System.out.println("Valid");
				break;
			}
			System.out.println("InValid");
		}
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