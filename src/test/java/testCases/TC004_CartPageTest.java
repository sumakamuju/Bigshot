package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC004_CartPageTest extends BaseClass{ 
	@Test 
	public void cart_page_verification() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.Account();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.btnSignin();  
//TO OPEN CART PAGE			
		hp.Cart_Icon();
		CartPage cp=new CartPage(driver);
		//cp.cart_list(); 
		//cp.cart_pricesummary(); 
		//cp.subtotalofdresses();	
		//cp.itemprice();
		//cp.addquantity_1();
		int subtotalofitems=cp.subtotalofdresses();
		int totalpriceofitems=cp.itemprice();
		Assert.assertEquals(subtotalofitems, totalpriceofitems); 
		//cp.shipping_fee();
		//cp.total_price();
		int shippingchrgs=cp.shipping_fee();
		int finalprice=cp.total_price();
		int expected_amount=(subtotalofitems+shippingchrgs);
		Assert.assertEquals(finalprice,expected_amount);
		cp.shipping_addrs();
		hp.Cart_Icon();
		cp.confirm_order();
		cp.agree_terms();
		cp.place_order();
		cp.finalorder_cofrm();
	 
	
	
	
	
	
	
}
	
	
	
	
	
}