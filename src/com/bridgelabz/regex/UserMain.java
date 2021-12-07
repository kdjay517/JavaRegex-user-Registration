package com.bridgelabz.regex;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface User {
	public boolean userValidation(String data, String regex);
}

public class UserMain {

	private static String firstNameRegex, lastNameRegex, emailIdRegex, mobileNumberRegex, passwordRegex;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws UserRegistrationException {
		User user = (data, regex) -> {
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(data);
			return (m.find() && m.group().equals(data));
		};
		
		UserDetailsWithLambda userDetails = new UserDetailsWithLambda();
		Set <UserDetailsWithLambda> lhashSet = new LinkedHashSet<UserDetailsWithLambda>();
		int switchTo;
		
		do {
			System.out.println("1.Fill User Registrtion Form" + "\n2. No Thanks");
			switchTo = sc.nextInt();
			switch (switchTo) {
				case 1:
					firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
					System.out.println("\nEnter your FirstName\n" +
			                "First Letter Will be UpperCase\n" +
			                "should Minimum 3 Characters");
					
					String firstName = sc.next();
						try {
							if (firstName.isEmpty() || !(user.userValidation(firstName, firstNameRegex))) {
								throw new UserRegistrationException("Please enter valid FIRST NAME!",
										UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
							}else
								System.out.println("valid");
						}
						catch (Exception e) {
							throw new UserRegistrationException("Please enter valid FIRST NAME!",
									UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
						}
			
					lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
					System.out.println("Enter your LastName\n" +
			                "First Letter Will be UpperCase\n" +
			                "should Minimum 3 Characters");
					String lastName = sc.next();
					
						try {
							if (lastName.isEmpty() || !user.userValidation(lastName, lastNameRegex)) {
								throw new UserRegistrationException("Please enter valid LAST NAME!",
										UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
							}else
								System.out.println("valid");
						}
						catch (Exception e) {
							throw new UserRegistrationException("Please enter valid LAST NAME!",
									UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
						}
					
					emailIdRegex = "^[A-Za-z0-9]+([.+-_][0-9a-zA-Z])*[@]([0-9a-zA-Z])+[.][a-zA-z]{2,3}([.][a-zA-z]{2,3})?$";
					System.out.println("Enter your mail Address");
					String emailId = sc.next();
					
						try {
							if (emailId.isEmpty() || !user.userValidation(emailId, emailIdRegex)) {
								throw new UserRegistrationException("Please enter valid EMAIL ADDRESS!",
										UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
							}else
								System.out.println("valid");
						}
						catch (Exception e) {
							throw new UserRegistrationException("Please enter valid EMAIL ADDRESS!",
									UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
						}
					
					mobileNumberRegex = "^([+])?([91]{2})?[\\s]?[6-9][0-9]{9}$";
					System.out.println("Enter your MobileNo\n" +
			                "With Country Code");
					String mobileNumber = sc.next();
					
						try {
							if (mobileNumber.isEmpty() || !user.userValidation(mobileNumber, mobileNumberRegex)) {
								throw new UserRegistrationException("Please enter valid MOBILE NUMBER!",
										UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
							}else
								System.out.println("valid");
						}
						catch(Exception e) {
							throw new UserRegistrationException("Please enter valid MOBILE NUMBER!",
									UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
						}
					
					passwordRegex = "(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])[a-zA-Z0-9!@#&()–[{}]:;',?/*~$^+=<>].{8,}$";
					System.out.println("Enter your Password\n" +
			                "at least contain One Uppercase, one Numeric, One Special Char\n" +
			                "and minimum 8 field length");
					String password = sc.next();
						try {
							if (password.isEmpty() || !user.userValidation(password, passwordRegex)) {
								throw new UserRegistrationException("Please enter valid PASSWORD!",
										UserRegistrationException.ExceptionType.INVALID_PASSWORD);
							}
								System.out.println("valid");
						}
						catch(Exception e) {
							throw new UserRegistrationException("Please enter valid PASSWORD!",
									UserRegistrationException.ExceptionType.INVALID_PASSWORD);
						}
						
					userDetails = new UserDetailsWithLambda(firstName, lastName, emailId, mobileNumber, password);
					lhashSet.add(userDetails);
					System.out.println(lhashSet);
					break;
					
				case 2:
					break;
			}
		}while(switchTo<2);

}}
