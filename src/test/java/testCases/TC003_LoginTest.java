package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC003_LoginTest extends BaseClass{

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
//TO CHECK ACCOUNT DETAILS BUTTON
	
		lp.account_name();
//TO CHECK USERNAME
		String username=lp.account_name();
		Assert.assertEquals(username, "palivelasridhar1","username mismatch");	
		
//PROFILE PAGE TEST	
		lp.account_details();
		lp.profile_name();
		lp.executescript();
		lp.txtfirst_name();
		lp.last_name();
		lp.date_of_birth();
		lp.selectgender();
		lp.country_drop_down();
		lp.countrycode_selection(); 
		lp.save();
	//	lp.cancel(); 
	
//WISHLIST OPTIONS 
		//should create specific pages for the dresses
		lp.clicksuits();
		lp.executescript();
		lp.selectsuit();
		lp.clickjodhpuri();
		lp.selectjodhpuri3();
		lp.selectjodhpiri5();
		lp.clickkurtapajamas();
		lp.selectkurta(); 
	hp.Account();
		lp.wishlist();
		lp.wishlist_count();
		lp.product_names();
		String actualproduct=lp.product_name(); 
		Assert.assertEquals(actualproduct, "Formal 3-piece suit", "product not selected"); 
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
// MOVE TO CART FROM WISHLIST
		
		lp.executescript();
		lp.product1_size();
		lp.movetocart_1(); 
		lp.wishlist();
		lp.product3_size();
		lp.movetocart_2(); 
//		hp.Account();
//		lp.orders(); //PAGE NOT DISPLAYING ORDERS- WEBSITE PROBLEM   
		
//ADDRESS PAGE
	hp.Account();	
		lp.address_page();
		lp.click_to_add_addrs();
		lp.name_in_addrs();
		lp.country_in_addrs();  
		lp.state_in_addrs();
		lp.city_in_addrs();
		lp.picode_in_addrs();
		lp.address_in(); 
		lp.countrycode_in_addrs();
		lp.phn_number();
		lp.addrs_type();
		lp.default_addrs();
		lp.save_addrs();
		lp.ok_button();
	//	lp.cancel_given_details();
	
	} 
		
} 
