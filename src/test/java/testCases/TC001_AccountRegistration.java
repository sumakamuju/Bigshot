package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistration extends BaseClass{
	@Test
	public void account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.Account();
		hp.clickRegister();
		
	}

}
