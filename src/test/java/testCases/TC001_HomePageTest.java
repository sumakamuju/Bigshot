package testCases;


import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_HomePageTest extends BaseClass{
	@Test
	public void homepagelinks() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.Account();
		hp.clickLogin();
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.btnSignin(); 
		
		hp.homeoption();
		hp.currency();
		hp.suits();
		hp.jodhpuris();
		hp.kurtapajamas();
		hp.pathanisuits();
		hp.jacketkurtasets();
		hp.sherwanis_indowestern();
		hp.blazors();
		hp.accessories();
		hp.company_logo();
		hp.search_box();
		hp.WishlistIcon();
		hp.Cart_Icon(); 
		
		
		
		
		
	}

	
	
	
	
	

}
