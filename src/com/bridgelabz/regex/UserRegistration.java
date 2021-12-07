package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public String regex;

	public boolean userFirstName(String firstName) throws UserRegistrationException {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		try {
			Pattern p = Pattern.compile(regex);

			if (firstName.isEmpty())
				throw new UserRegistrationException("Please enter valid FIRST NAME!",
						UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
			Matcher m = p.matcher(firstName);
			return (m.find() && m.group().equals(firstName));
		} catch (Exception e) {
			throw new UserRegistrationException("Please enter valid FIRST NAME!",
					UserRegistrationException.ExceptionType.INVALID_FIRST_NAME);
		}
	}

	public boolean userLastName(String lastName) throws UserRegistrationException {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		try {
			Pattern p = Pattern.compile(regex);

			if (lastName.isEmpty())
				throw new UserRegistrationException("Please enter valid LAST NAME!",
						UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
			Matcher m = p.matcher(lastName);
			return (m.find() && m.group().equals(lastName));
		} catch (Exception e) {
			throw new UserRegistrationException("Please enter valid LAST NAME!",
					UserRegistrationException.ExceptionType.INVALID_LAST_NAME);
		}
	}

	public boolean useremailAddress(String email) throws UserRegistrationException {
		regex = "^[A-Za-z0-9]+([.+-_][0-9a-zA-Z])*[@]([0-9a-zA-Z])+[.][a-zA-z]{2,3}([.][a-zA-z]{2,3})?$";
		try {
			Pattern p = Pattern.compile(regex);
			if (email.isEmpty())
				throw new UserRegistrationException("Please enter valid EMAIL!",
						UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
			Matcher m = p.matcher(email);
			return (m.find() && m.group().equals(email));
		} catch (Exception e) {
			throw new UserRegistrationException("Please enter valid EMAIL!",
					UserRegistrationException.ExceptionType.INVALID_EMAIL_ID);
		}
	}

	public boolean userMobileNumber(String number) throws UserRegistrationException {
		regex = "^([+])?[91]{2}[\\s]?[6-9][0-9]{9}$";
		try {
			Pattern p = Pattern.compile(regex);
			if (number.isEmpty())
				throw new UserRegistrationException("Please enter valid PHONE NUMBER!",
						UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
			Matcher m = p.matcher(number);
			return (m.find() && m.group().equals(number));
		} catch (Exception e) {
			throw new UserRegistrationException("Please enter valid PHONE NUMBER!",
					UserRegistrationException.ExceptionType.INVALID_PHONE_NUMBER);
		}
	}

	public boolean userPassword(String password) throws UserRegistrationException {
		regex = "(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>])[a-zA-Z0-9!@#&()–[{}]:;',?/*~$^+=<>].{8,}$";
		try {
			Pattern p = Pattern.compile(regex);
			if (password.isEmpty())
				throw new UserRegistrationException("Please enter valid PASSWORD!",
						UserRegistrationException.ExceptionType.INVALID_PASSWORD);
			Matcher m = p.matcher(password);
			return (m.find() && m.group().equals(password));
		} catch (Exception e) {
			throw new UserRegistrationException("Please enter valid PASSWORD!",
					UserRegistrationException.ExceptionType.INVALID_PASSWORD);
		}
	}
}

