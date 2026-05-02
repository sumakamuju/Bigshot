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
		hp.clickRegister();
		AccountRegistrationPage ap=new AccountRegistrationPage(driver);
		ap.first_name(randomString().toUpperCase());
		ap.last_name(randomString().toUpperCase());
		ap.email_id(randomString()+"@gmail.com");
		ap.password(p.getProperty("password")); 
		ap.confirmpswd(p.getProperty("password"));
		ap.country_code();
		ap.country_optn();
		ap.phnnumbr("8142171354");
		ap.select_gender();
		ap.sign_up();
		
		

		
	}

}
