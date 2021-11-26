package test.com.bridgelabz.junituser;

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
		boolean actualResult = userRegistration.userFirstName("Dhanunjaya");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserFirstName_NotStartWith_Capital_LetterThenFalse() {
		boolean actualResult = userRegistration.userFirstName("dhanunjaya");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUserLastName_StartWith_Capital_LetterThenTrue(){
		boolean actualResult = userRegistration.userLastName("Kummari");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserLastName_NotStartWith_Capital_LetterThenFalse(){
		boolean actualResult = userRegistration.userLastName("kummari");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUsereMailid_Is_ValidThenTrue() {
		boolean actualResult = userRegistration.useremailAddress("abc@yahoo.com");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUsereMailid_Is_NotValidThenFalse() {
		boolean actualResult = userRegistration.useremailAddress("abc@.com.my");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUserMobileNumber_Is_ValidThenTrue() {
		boolean actualResult = userRegistration.userMobileNumber("+918978041840");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserMobileNumber_Is_NotValidThenFalse() {
		boolean actualResult = userRegistration.userMobileNumber("+92 8978041840");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase1_Is_ValidThenTrue() {
		boolean actualResult = userRegistration.userPassword1("dhanunjaya");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase1_Is_NotValidThenFalse() {
		boolean actualResult = userRegistration.userPassword1("dhanu");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase2_Is_ValidThenTrue() {
		boolean actualResult = userRegistration.userPassword2("Dhanunjaya");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase2_Is_NotValidThenFalse() {
		boolean actualResult = userRegistration.userPassword2("dhanu123");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase3_Is_ValidThenTrue() {
		boolean actualResult = userRegistration.userPassword3("dHanunjay123");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase3_Is_NotValidThenFalse() {
		boolean actualResult = userRegistration.userPassword3("dhanunjay123");
		assertEquals(false, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase4_Is_ValidThenTrue() {
		boolean actualResult = userRegistration.userPassword4("dHanunjay@123");
		assertEquals(true, actualResult);
	}
	
	@Test
	public void ifUserPasswordCase4_Is_NotValidThenFalse() {
		boolean actualResult = userRegistration.userPassword4("dHanunjay123");
		assertEquals(false, actualResult);
	}
}
