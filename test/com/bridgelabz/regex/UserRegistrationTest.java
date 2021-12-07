package com.bridgelabz.regex;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationTest {
	static UserRegistration userRegistration;
	
	@BeforeClass
	public static void init() {
		userRegistration = new UserRegistration();
	}
	
	@Test
	public void ifUserFirstName_StartWith_Capital_LetterThenTrue() {
		boolean actualResult;
		try {
			actualResult = userRegistration.userFirstName("");
			
		} catch (UserRegistrationException e) {
			  assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
		}
		
	}
	
	@Test
	public void ifUserFirstName_NotStartWith_Capital_LetterThenFalse() {
		boolean actualResult;
		try {
			actualResult = userRegistration.userFirstName("dhanunjaya");
			assertEquals(false, actualResult);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void ifUserLastName_StartWith_Capital_LetterThenTrue(){
		boolean actualResult;
		try {
			actualResult = userRegistration.userLastName("Kummari");
			assertEquals(true, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUserLastName_NotStartWith_Capital_LetterThenFalse(){
		boolean actualResult;
		try {
			actualResult = userRegistration.userLastName("kummari");
			assertEquals(false, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUsereMailid_Is_ValidThenTrue() {
		boolean actualResult;
		try {
			actualResult = userRegistration.useremailAddress("abc@yahoo.com");
			assertEquals(true, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUsereMailid_Is_NotValidThenFalse() {
		boolean actualResult;
		try {
			actualResult = userRegistration.useremailAddress("abc@.com.my");
			assertEquals(false, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUserMobileNumber_Is_ValidThenTrue() {
		boolean actualResult;
		try {
			actualResult = userRegistration.userMobileNumber("+918978041840");
			assertEquals(true, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUserMobileNumber_Is_NotValidThenFalse() {
		boolean actualResult;
		try {
			actualResult = userRegistration.userMobileNumber("+92 8978041840");
			assertEquals(false, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUserPasswordCase4_Is_ValidThenTrue() {
		boolean actualResult;
		try {
			actualResult = userRegistration.userPassword("dHanunjay@123");
			assertEquals(true, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifUserPasswordCase4_Is_NotValidThenFalse() {
		boolean actualResult;
		try {
			actualResult = userRegistration.userPassword("dHanunjay123");
			assertEquals(false, actualResult);
		} catch (UserRegistrationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
