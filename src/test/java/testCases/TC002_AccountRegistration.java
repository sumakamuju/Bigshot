package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC002_AccountRegistration extends BaseClass{
	@Test
	public void account_registration()
	{
		HomePage hp=new HomePage(driver);
	//	hp.Account();
		logger.info("Clicking on registration link to create new account");
	//	hp.clickRegister();
		AccountRegistrationPage ap=new AccountRegistrationPage(driver);
		
//ACCOUNT REGISTRATION
/*		ap.first_name("Sita");
		ap.last_name("Kamuju");
		ap.email_id("sitakamuju1010@gmail.com");
		ap.password("suma&sunny1508"); 
		ap.confirmpswd("suma&sunny1508");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9010020555");
		ap.select_gender();
		ap.sign_up();
		System.out.println("Registration successful");
		System.out.println("Instead of registration successful msg, An error occurred while processing your request. is displayed");
	//	Assert.assertEquals(ap.regerrmsg(),"Registration successful");
		System.out.println("Registration successful");
		logger.info("Though registration is successful, wrong prompt message is displaying");*/

//NEGATIVE TESTING
		logger.info("Negative testing in Registration window");
//1. LEAVING FIRST NAME AND LAST NAME FIELDS EMPTY
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("   ");
		ap.last_name("   ");
		ap.email_id("gopalrao@gmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.fst_name_requrd(), "First Name is required!");
		System.out.println("prompt msg with first name required is displayed");
		Assert.assertEquals(ap.lst_name_requrd(), "Last Name is required!");
		System.out.println("prompt msg with last name required is displayed");
		ap.close_reg_window();
		logger.info("registration with empty name fields-- test passed with error message");

//2. LEAVING  MAIL ID FIELD EMPTY
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("    ");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.email_err_msg(), "Email is required!");
		System.out.println("prompt msg with email required is displayed");
		ap.close_reg_window();
		logger.info("registration with empty mail id field-- test passed with error message");

//3.  EMPTY PASSWORD & CONFIRM PASSWORD FIELDS
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("gopalrao@gmail.com");
		ap.password("");
		ap.confirmpswd("");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.empty_pswd(), "Password is required!");
		Assert.assertEquals(ap.empty_cnfm_pswd(), "Confirm Password is required!");
		System.out.println("prompt msg with Password is required! & Confirm Password is required! is displayed for both the fields");
		ap.close_reg_window();
		logger.info("registration with both empty password fields-- test passed with error message");

//4.EMPTY PASSWORD FIELD 
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("gopalrao@gmail.com");
		ap.password("");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up(); 
		Assert.assertEquals(ap.empty_pswd_only(), "Password is required!");
		Assert.assertEquals(ap.cnfm_pswd_msg(), "Passwords do not match!");
		System.out.println("prompt msg with Password is required! & Passwords do not match! is displayed for both the fields");
		ap.close_reg_window();
		logger.info("registration with empty password field -- test passed with error message");

//5.EMPTY CONFIRM PASSWORD FIELD
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("gopalrao@gmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up(); 
		Assert.assertEquals(ap.empty_cnfm_pswd_only(), "Confirm Password is required!");
		System.out.println("prompt msg with Confirm Password is required! is displayed for confirm password fields");
		ap.close_reg_window();
		logger.info("registration with empty confirm password field -- test passed with error message");

//6.EMPTY PHONE NUMBER
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("gopalrao@gmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("");
		ap.select_gender_male();
		ap.sign_up(); 
		Assert.assertEquals(ap.empty_phn_no(), "Phone Number is required!");
		System.out.println("prompt msg with Phone Number is required! is displayed ");
		ap.close_reg_window();
		logger.info("registration with empty phn number field -- test passed with error message");


//7.ENTERING INVALID MAIL FORMAT
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("Gopalraogmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.invalid_mail(), "Invalid Email Address!");
		System.out.println("prompt msg with Invalid Email Address! is displayed");
		ap.close_reg_window();
		logger.info("registration with invalid mail id field-- test passed with error message");

//8.ENTERING WEAK PASSWORDS
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("Gopalrao@gmail.com");
		ap.password("gopal");
		ap.confirmpswd("gopal");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.weak_pswd_entry(), "Password must be between 8 and 16 characters!");
		System.out.println("prompt msg with Password must be between 8 and 16 characters! is displayed");
		ap.close_reg_window();
		logger.info("registration with weak password field-- test passed with error message"); 

//9.PASSWORDS MISMATCH OR WRONG CONFIRM PASSWORD
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("RAO");
		ap.email_id("Gopalrao@gmail.com");
		ap.password("gopalrao@123");
		ap.confirmpswd("gopal");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.pswd_mismatch(), "Passwords do not match!");
		System.out.println("prompt msg with Passwords do not match! is displayed");
		ap.close_reg_window();
		logger.info("registration with mismatch password fields-- test passed with error message");

//10.REGISTERING WITH ALREADY EXISTING MAIL ID
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("Suma");
		ap.last_name("Kamuju");
		ap.email_id("sumakamuju109@gmail.com");
		ap.password("suma&sunny1508"); 
		ap.confirmpswd("suma&sunny1508");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9010020445");
		ap.select_gender();
		ap.sign_up();
		Assert.assertEquals(ap.reg_mail_id(), "Already your phonenumber and email is registered. Please use the different mail and phonenumber.");
		System.out.println("prompt msg with  Already your phonenumber and email is registered. Please use the different mail and phonenumber. is displayed");
		ap.close_reg_window();
		logger.info("registration with already existing mail id-- test passed with error message");

//11.USE SPECIAL CHARACTERS IN NAME FIELDS
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL@#!$%");
		ap.last_name("RAO*()&^");
		ap.email_id("Gopalrao@gmail.com");
		ap.password("gopalrao@123");
		ap.confirmpswd("gopalrao@123");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up(); 
		Assert.assertEquals(ap.name_with_spl_char(), "Last Name must only contain letters!");
		System.out.println("spl  characters accepted in first name field but, prompt msg with Last Name must only contain letters! is displayed");
		ap.close_reg_window();
		logger.info("registration with spl characters in names field-- test passed with error message"); 

//12.ENTERING ONLY FIRST NAME WIHTOUT LAST NAME
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("GOPAL");
		ap.last_name("");
		ap.email_id("Gopalrao@gmail.com");
		ap.password("gopalrao@123");
		ap.confirmpswd("gopalrao@123");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9123456789");
		ap.select_gender_male();
		ap.sign_up(); 
		Assert.assertEquals(ap.empty_lst_name_field(), "Last Name is required!");
		System.out.println("prompt msg with Last Name is required! is displayed");
		ap.close_reg_window();
		logger.info("registration with last name field empty-- test passed with error message");
		
//13.ENTERING PHONE NUMBER WITH LESS THAN 10 DIGITS
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("SRI SANVIT");
		ap.last_name("SUNNY");
		ap.email_id("gopalraosunny456@gmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("0456");
		ap.select_gender_male();
		ap.sign_up(); 
		Assert.assertEquals(ap.phn_err_less_digits(), "Phone Number must be 10 digits!");
		System.out.println("prompt msg with Phone Number must be 10 digits! is displayed ");
		ap.close_reg_window();
		logger.info("registration with less than 10 digits phn number field -- test passed with error message");

//16.SPECIAL CHARACTERS IN PHONE NUMBER
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("SRI SANVIT V");
		ap.last_name("SUNNY");
		ap.email_id("gopalsrisunny456@gmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("!@#$%^&*()1234");
		ap.select_gender_male();
		ap.sign_up();  
		Assert.assertEquals(ap.spl_char_phn_no(), "Phone Number must be 10 digits!");
		System.out.println("prompt msg with Phone Number must be 10 digits! is displayed ");
		ap.close_reg_window();
		logger.info("registration with spl characters in phn number field -- not detecting spl characters but accepting numerics --test passed with error message");
//15.ENTER EXTREMELY LONG INPUT STRINGS-------FAILED
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("VINAYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
		ap.last_name("LAXMIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		ap.email_id("sitalaxmi41@gmail.com");
		ap.password("sitalaxmi@123");
		ap.confirmpswd("sitalaxmi@123");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9741896463");
		ap.select_gender_male();
		ap.sign_up();
		Assert.assertEquals(ap.long_strings(), "Maximum string limit reached");
		System.out.println("prompt msg with Maximum string limit reached is displayed");
		ap.close_reg_window();
		logger.info("registration with Maximum strings-- test failed and registration is done");
//14.EMPTY GENDER FIELD ---------FAILED
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("SUBHASH2");
		ap.last_name("KAMUJUabc");
		ap.email_id("subbuyr220606@gmail.com");
		ap.password("gopalrao123@");
		ap.confirmpswd("gopalrao123@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("9456329122");
		ap.sign_up(); 
		Assert.assertEquals(ap.empty_gender_reg(), "Gender is required!");
		System.out.println("prompt msg with Gender is required! is displayed");
		ap.close_reg_window();
		logger.info("registration with empty gender field -- test failed as registration is done without gender");
		
//17.PHN NUMBER WITH MORE THAN 10 DIGITS----FAILED
		hp.Account(); 
		hp.clickRegister();
		ap.first_name("NIHANTH");
		ap.last_name("ADRITH");
		ap.email_id("nihanth121114@gmail.com");
		ap.password("gopalrao@");
		ap.confirmpswd("gopalrao@");
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("0111111111890123456789");
		ap.select_gender_male();
		ap.sign_up(); 
		System.out.println("Account is being registered even while giving more than 10 digits in phone number");
		Assert.assertEquals(ap.regerrmsg(), "Phone Number must be 10 digits!");
		ap.close_reg_window();
		logger.info("registration with more than 10 digits in phn number field -- accepting --test failed with registration error message");
		
	}

}
