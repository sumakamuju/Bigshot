package testCases;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Suitspage;
import testBase.BaseClass;

public class TC003_LoginTest extends BaseClass{

	@Test
	public void verify_login() throws InterruptedException, IOException {
		HomePage hp=new HomePage(driver);
		hp.Account();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.btnSignin();  
		Suitspage sp= new Suitspage(driver);
		
//SIGN IN WITH OTP
	//	lp.sign_in_otp();
	//THROUGH MAIL
	/*	lp.otp_mail();
		lp.email_input_box("sumatestingmail@gmail.com");
		lp.submit_btn();
		System.out.println("Displaying internal server error");
		lp.back_btn();*/
	//THROUGH PHONE NUMBER
	/*	lp.otp_phn();
		lp.phn_optn_country_code();
		lp.phn_drop_down_optn1();
		lp.phn_no_input("8142171354");
		lp.submit_btn();
		
//FORGOT PASSWORD
	/*	lp.forgot_pswd();
		lp.forgot_pswd_mail_input("sumatestingmail@gmail.com");
		lp.forgot_pswd_submit();
		System.out.println("Error: An internal server error occurred. Please try again later. is displaying");
		
//		hp.Account();
//TO CHECK ACCOUNT DETAILS BUTTON
/*		logger.info("Checking account name as per the registration");
		lp.account_name();
//TO CHECK USERNAME
		String username=lp.account_name();
		Assert.assertEquals(username, "palivelasridhar1","username mismatch");	
		
//PROFILE PAGE TEST	
		logger.info("Updating profile page");
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
		logger.info("Acconut updation done and saved");
//WISHLIST OPTIONS 
		//should create specific pages for the dresses
		logger.info("Selecting dresses and size");
		lp.clicksuits();
		lp.executescript();
		lp.selectsuit(); 
		lp.clickjodhpuri();
		lp.selectjodhpuri3();
		lp.selectjodhpiri5();
		lp.clickkurtapajamas();
		lp.selectkurta(); 
		logger.info("Checking details in wishlist");
	hp.Account();
		lp.wishlist();
		lp.wishlist_count();
		lp.product_names();
		String actualproduct=lp.product_name(); 
		Assert.assertEquals(actualproduct, "Formal 3-piece suit", "product not selected"); 
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
// MOVE TO CART FROM WISHLIST
		logger.info("Selecting dresses and moving to cart");
		lp.executescript();
		lp.product1_size();
		lp.movetocart_1(); 
		lp.wishlist();
		lp.product3_size();
		lp.movetocart_2(); */
//		hp.Account();
//		lp.orders(); //PAGE NOT DISPLAYING ORDERS- WEBSITE PROBLEM   
		
//ADDRESS PAGE
	//	logger.info("Entering valid address details for shipping");
//	hp.Account();	
/*		lp.address_page();
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
		lp.ok_button();*/
	//	lp.cancel_given_details();
	//	lp.logout();
	//	logger.info("Checking all the sub-links of account link is completed");


//NEGATIVE TESTING		

//FOR LOGIN	
//1. SUBMITTING EMPTY FIELDS FOR LOGIN		
/*		lp.set_email_empty("               ");
		lp.set_pswd_empty("         ");
		lp.click_submit();
	String err_email_msg=lp.error_mail_msg();
	String pswd=lp.error_pswd_msg();
	Assert.assertEquals(err_email_msg, "Please enter a valid email.");
	Assert.assertEquals(pswd, "Please enter a valid password.");   */

//2.ENTERING INVALID LOGIN CREDENTIALS
		//invalid mail id
/*	lp.set_invalid_email("sumakamuju09@gmail.com");
	lp.setPassword("suma&sunny1508");
	lp.click_submit();
	String invalid_mail_msg=lp.invalid_mail_msg();
	Assert.assertEquals(invalid_mail_msg, "User not found. Please register first.");
	//invalid pswd
	lp.setEmail("sumakamuju109@gmail.com");
	lp.set_invalid_pwsd("sumasunny");
	lp.click_submit();
	Assert.assertEquals(lp.invalid_pswd_msg(),"Your password is invalid. Please try again.");*/	

//3.SIGN IN WITH OTP
	
//	lp.sign_in_otp();

//THROUGH MAIL
//1.Entering unregistered mail id
/*	lp.otp_mail();
	lp.email_input_box("sumakamuju@gmail.com");
	lp.submit_btn();
	System.out.println("Displaying internal server error");
//2.Empty mail field
	lp.otp_mail();
	lp.email_input_box("       ");
	lp.submit_btn();
	Assert.assertEquals(lp.submit_err_msg(),"Please enter your email address or phone number.");
	System.out.println("Displaying error msg: Please enter your email address or phone number.");
//3.Invalid email format
	lp.otp_mail();
	lp.email_input_box("sumakamuju109gmail.com");
	lp.submit_btn();
	Assert.assertEquals(lp.submit_err_msg(),"Please enter a valid email address or phone number.");
	System.out.println("Displaying error msg: Please enter a valid email address or phone number.");
//4.Space before email
	lp.otp_mail();
	lp.email_input_box(" sumakamuju109gmail.com");
	lp.submit_btn();
	Assert.assertEquals(lp.submit_err_msg(),"Please enter a valid email address or phone number.");
	System.out.println("Displaying error msg: Please enter a valid email address or phone number");*/
	
//THROUGH PHONE NUMBER
//1.Submitting invalid phone number format
/*	lp.otp_phn();
	lp.phn_optn_country_code();
	lp.phn_drop_down_optn1();
	lp.phn_no_input("123456");
	lp.submit_btn();
	Assert.assertEquals(lp.submit_err_msg(), "Please enter a valid email address or phone number.");
	System.out.println("Error msg with Please enter a valid email address or phone number.");
//2.Entering unregistered mobile number
	lp.otp_phn();
	lp.phn_optn_country_code();
	lp.phn_drop_down_optn1();
	lp.phn_no_input("9010020333");
	lp.submit_btn();
//3.Submitting  phone number with splcharacters format
	lp.otp_phn();
	lp.phn_optn_country_code();
	lp.phn_drop_down_optn1();
	lp.phn_no_input("8142171@!#");
	lp.submit_btn();
	Assert.assertEquals(lp.submit_err_msg(), "Please enter a valid email address or phone number.");
	System.out.println("Error msg with Please enter a valid email address or phone number.");	
//4.Submitting  phone number with empty format
	lp.otp_phn();
	lp.phn_optn_country_code();
	lp.phn_drop_down_optn1();
	lp.phn_no_input("        ");
	lp.submit_btn();
//	Assert.assertEquals(lp.submit_err_msg(), "Please enter your email address or phone number.");
//	System.out.println("Error msg with Please enter your email address or phone number.");
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File targetfile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
	FileHandler.copy(sourcefile, targetfile); 
	 
//FORGOT PASSWORD
//1.Entering unregistered mail id
/*	lp.forgot_pswd();
	lp.forgot_pswd_mail_input("sumakamuju@gmail.com");
	lp.forgot_pswd_submit();
	System.out.println("Error: An internal server error occurred. Please try again later. is displaying");
//2.Submitting empty email field
	lp.forgot_pswd();
	lp.forgot_pswd_mail_input("   ");
	lp.forgot_pswd_submit();
	Assert.assertEquals(lp.submit_err_msg(), "Please enter your email.");
	System.out.println("Error msg with Please enter your email. is displayed");
//3.Invalid email format
	lp.forgot_pswd();
	lp.forgot_pswd_mail_input("sumakamuju109gmail.com");
	lp.forgot_pswd_submit();
	Assert.assertEquals(lp.submit_err_msg(), "Please enter a valid email address.");
	System.out.println("Error msg with Please enter a valid email address. is displayed");
//4.Spaces before email
	lp.forgot_pswd();
	lp.forgot_pswd_mail_input("  sumakamuju109@gmail.com");
	lp.forgot_pswd_submit();
	Assert.assertEquals(lp.submit_err_msg(), "Error: An internal server error occurred. Please try again later.");
	System.out.println("Error msg with Error: An internal server error occurred. Please try again later. is displayed");*/
	
//WISHLISTPAGE
		
//1. WISHLISTING PRODUCT WITHOUT LOGIN
/*	hp.sherwanis_indowestern();
	lp.slct_pro_17();
	Assert.assertEquals(lp.login_prompt_msg(),"Sign in");
	logger.info("wishlisting without login test passed- sign in prompt message diplayed");*/
//2. Add same product multiple times	
/*	hp.sherwanis_indowestern();
	lp.slct_pro_18();
	lp.slct_pro_17();
	lp.slct_pro_18();
	hp.WishlistIcon();
	Assert.assertEquals(lp.wishlist_count(),"1 Items");
	logger.info("only 1 product is wishlisted as 2nd product is clicked 2 times which deselected the item from wishlist.");*/

//PRODUCT PAGE
//1.Exceeding the quantity of the product
/*	hp.suits();
	sp.slct_suit2();
	sp.suit_size_large();
	for(int i=1;i<200;i++) {
		sp.suitquant_more();
	}
	sp.move_to_cart();
	hp.Cart_Icon();
	Assert.assertEquals(sp.qty_of_suit(), "2");
	logger.info("Exceeding the quantity of the product to 200 and is added to cart. Test Failed as there is no limit for product quantity");*/
//2.Add negative quantity in the cart page
/*		hp.suits();
		sp.slct_suit2();
		sp.suit_size_large();	
		for(int i=1;i<4;i++) {
			sp.suitquant_more();
		}
		sp.move_to_cart();
		hp.Cart_Icon();
		for(int i=1;i<6;i++) {
		sp.suitquant_less();
		}
		Assert.assertEquals(sp.qty_of_suit(),"1");
		logger.info("minimum quantity-strictly 1 count is displayed");*/
	
	
	
	
	}  
		
} 
