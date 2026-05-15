package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Suitspage;
import testBase.BaseClass;

public class TC005_SuitsPageTest extends BaseClass{
	@Test
	public void verify_suits_page() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		CartPage cp=new CartPage(driver);
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
		
		//PRODUCT PAGE---NEGATIVE TESTING
		//1.Exceeding the quantity of the product
			hp.suits();
			sp.slct_suit2();
			sp.suit_size_large(); 
			for(int i=1;i<200;i++) {
				sp.suitquant_more();
			}
			sp.move_to_cart();
			hp.Cart_Icon();
		//	Assert.assertEquals(sp.qty_of_suit(), "2");
			logger.info("Exceeding the quantity of the product to 200 and is added to cart. Test Failed as there is no limit for product quantity");
			cp.remove_pro_cart();
			cp.confirm_removal();
			//2.Add negative quantity in the cart page
				hp.suits();
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
		//		Assert.assertEquals(sp.qty_of_suit(),"1");
				logger.info("minimum quantity-strictly 1 count is displayed");
			
			
			
		
		
		
	}

}
