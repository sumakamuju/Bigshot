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
		logger.info("Checking details in the cart page");
		hp.Cart_Icon();
		CartPage cp=new CartPage(driver);
/*		cp.addquantity_1();
		cp.cart_list(); 
		//cp.cart_pricesummary(); 
		//cp.subtotalofdresses();	
		//cp.itemprice();
		
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
	 logger.info("checking all the links of cart page is completed");*/

//USING ANOTHER ACCOUNT
		String carttitle=cp.cart_page_title();
		Assert.assertEquals(carttitle, "Shopping Bag");
		cp.add_qty_of_1st_item();
		
		cp.cart_items();
		cp.add_addrs();
	int s_ttl=cp.sub_total();
	int c_price=cp.cart_price();
		Assert.assertEquals(s_ttl,c_price);
	int sh_fee=	cp.shipping_fee();
	int ttl_price=cp.total_price();
	int expected_amount=(s_ttl+sh_fee);
		Assert.assertEquals(ttl_price,expected_amount); 
	//	cp.delete_item();
		cp.confirm_order();
		cp.agree_terms();
		cp.place_order();
		cp.finalorder_cofrm();
	
	 
		
			
}
	
}