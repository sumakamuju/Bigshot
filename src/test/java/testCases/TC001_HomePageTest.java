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
//		logger.info("Clicked on Account Link");
				hp.Account();
		hp.clickLogin();
		logger.info("Login with valid email id and password");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.btnSignin(); 
		logger.info("Checking all the link of the HomePage");
		hp.homeoption();
	/*	hp.currency();
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
		
		hp.homeoption();
		hp.shop_now(); */
		
//		logger.info("Checked all the links in HomePage is completed");
//		hp.Reg_addrs();
//hp.useful_links();
//		hp.useful_links_pgtext();
//	hp.Shop_by();
//		hp.my_account_links();
		hp.search_box("jodhpuris");
		hp.product_selection();
		
		
	}

	
	
	
	
	

}
