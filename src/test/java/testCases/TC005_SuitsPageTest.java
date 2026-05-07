package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Suitspage;
import testBase.BaseClass;

public class TC005_SuitsPageTest extends BaseClass{
	@Test
	public void verify_suits_page() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.Account();
		hp.clickLogin();
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.btnSignin();
		hp.suits(); 
		Suitspage sp=new Suitspage(driver);
		sp.sort_by_option();
		sp.move_suit1_to_cart();
		sp.move_suit2_to_cart();
		
		
		
		
		
	}

}
