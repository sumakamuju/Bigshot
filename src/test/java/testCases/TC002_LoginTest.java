package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	@Test
	public void verify_login() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.Account();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.btnSignin();
		
		
	}

}
