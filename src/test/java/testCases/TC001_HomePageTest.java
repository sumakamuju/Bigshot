package testCases;


import org.testng.Assert;
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
/*		hp.Account();
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
		hp.shop_now(); 
		
		logger.info("Checked all the links in HomePage is completed");
	hp.Reg_addrs();
	hp.useful_links();
		hp.useful_links_pgtext();
	hp.Shop_by();
		hp.my_account_links();
		hp.search_box("jodhpuris");
		hp.product_selection();*/
	
//NEAGTIVE TESTING FOR SEARCH BAR
//1.EMPTY SEARCH
		hp.negative_test_in_search("      ");
		Assert.assertEquals(hp.searchmsg_1(),"No suggestions found");
		System.out.println("validation message verified");
		logger.info("empty search failed with no suggestions found message");
//2.WITH SPECIAL CHARACTERS
		hp.negative_test_in_search("@#%%$^^$$");
		Assert.assertEquals(hp.searchmsg_2(),"Error retrieving suggestions");
		System.out.println("validation message verified"); 
		logger.info("spl charc search failed with Error retrieving suggestions");
//3.CASE SENSITIVITY
		hp.negative_test_in_search("jodhpuris");
		hp.searchmsg_3(); 
		Assert.assertTrue(hp.searchmsg_3(),"product not displayed");
		System.out.println("search is not case sensitive");
		logger.info("search performed with lower case letters and search passed without error message as it is not case sensitive");
//4.WITHOUT SPACE BETWEEN WORDS	
		hp.negative_test_in_search("kurtapajamas");
		Assert.assertEquals(hp.searchmsg_2(),"Error retrieving suggestions");
		System.out.println("Error displayed if no spaces between words");
		logger.info("search performed without spaces between words and test passed with error message");
//5.WITH WRONG SPELLING 
		hp.negative_test_in_search("kurtha");
		Assert.assertEquals(hp.searchmsg_2(),"Error retrieving suggestions");
		System.out.println("Error message displayed with wrong spelling");
		logger.info("search performed with wrong spelling and test passed with error message");
//6.WITH TWO OR MORE LEADING SPACE
		hp.negative_test_in_search("  kurta"); 
		Assert.assertEquals(hp.searchmsg_2(),"Error retrieving suggestions");
		System.out.println("Error message displayed with two or more leading spaces before word");
		logger.info("search performed with leading spaces and test passed with error message");
//7.WITH tWO OR MORE TRAILING SPACES
		hp.negative_test_in_search("kurta  ");
		Assert.assertEquals(hp.searchmsg_2(),"Error retrieving suggestions");
		System.out.println("Error message displayed with two or more trailing spaces after word");
		logger.info("search performed with trailing spaces and test passed with error message");
//8.MIXED CASE	 
		hp.negative_test_in_search("joDHpuris");
		Assert.assertTrue(hp.searchmsg_3(), "product not displayed");
		System.out.println("search performed and result appeared");
		logger.info("search performed with mixed case word and search passed without error message");
//9.NUMBER IN SEARCH
		hp.negative_test_in_search("jodhpuris123");
		Assert.assertEquals(hp.searchmsg_2(),"Error retrieving suggestions");
		System.out.println("Error message displayed with numbers in search bar");
		logger.info("search performed with numbers in search word and test passed with error message");		
		
//10.PARTIAL SEARCH
		hp.negative_test_in_search("jodhpur");
		Assert.assertTrue(hp.searchmsg_3(), "product not displayed");
		System.out.println("search performed and result appeared");
		logger.info("search performed with half spelling  word and search passed without error message");
	}  
}
	
	
	


