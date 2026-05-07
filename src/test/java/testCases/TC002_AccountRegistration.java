package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC002_AccountRegistration extends BaseClass{
	@Test
	public void account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.Account();
		logger.info("Clicking on registration link to create new account");
		hp.clickRegister();
		AccountRegistrationPage ap=new AccountRegistrationPage(driver);
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
		logger.info("Account creation successful");
		

		
	}

}
