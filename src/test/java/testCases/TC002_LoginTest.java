package testCases;



import org.testng.Assert;
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
		hp.Account();
		System.out.println(lp.account_name());
		lp.account_details();
		//lp.profile_name();
		lp.executescript();
		lp.txtfirst_name();
		lp.last_name();
		lp.date_of_birth();
		lp.selectgender();
		lp.country_drop_down();
		lp.countrycode_selection(); 
		lp.save(); 
		
		//to check user name
		hp.Account();
		String username=lp.account_name();
		Assert.assertEquals(username,"palivelasridhar1", "Username mismatch");		
		System.out.println(username);
		hp.Account();
		lp.logout();
		
//		hp.sherwanis();
//		lp.executescript();
//		hp.dresssize();
//		hp.selecteddress();
//	
//		lp.orders();
//		lp.addresses();
//		
	}

}
