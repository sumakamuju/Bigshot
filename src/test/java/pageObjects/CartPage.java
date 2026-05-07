package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage{
	public WebDriverWait wait;
	public CartPage(WebDriver driver) {
		super(driver);
	}
/*	 @FindBy(xpath="//*[@id=\"cart-items\"]")
	 List <WebElement> cartitems;
	 @FindBy(xpath="//*[@class=\"qty-plus\"]")
	 WebElement addquantity;
	 @FindBy(xpath="//*[@class=\"price_summary pt-3 pb-3\"]")
	 WebElement pricesummary;
	 @FindBy(xpath="//*[@class=\"cart_inline pad_lt_12\"]/p")
	 List<WebElement> subtotal;
	 
	 @FindBy(xpath="//*[@class=\"price_ew_no\"]")
	 WebElement priceofitems;
	 @FindBy(xpath="//*[@class=\"price_summary pt-3 pb-3\"]/div[2]")
	 WebElement shippingfee;
	 @FindBy(xpath="//*[@class=\"price_summary pt-3 pb-3\"]/div[3]")
	 WebElement totalamount;
	 @FindBy(xpath="//*[@id=\"changeAddressButton\"]")
	 WebElement selectaddrs;
	 @FindBy(xpath="//*[@class=\"col-md-6 mr_bot-22\"]")
	 WebElement confirmaddrs;
	 @FindBy(xpath="//*[@id=\"place-order-button\"]")
	 WebElement placeorder;
	 @FindBy(xpath="//*[@class=\"form-check-input\"][@id=\"agree-terms\"]")
	 WebElement agreeterms;
	 @FindBy(xpath="//*[@class=\"col-md-6 col-lg-7 col-sm-6\"]")
	 WebElement plcorder;
	 @FindBy(xpath="//*[@class=\"swal2-actions\"]/button[1]")
	 WebElement fnlconfirmation;
	 
	
	public void cart_list() {
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOfAllElements(cartitems)); 
		for(WebElement cart: cartitems) {
			System.out.println(cart.getText());
		}
	}
	 public void addquantity_1(){
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOf(addquantity));
		 addquantity.click();
	 }
	public void cart_pricesummary() {
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOf(pricesummary));
		System.out.println(pricesummary.getText());
	}
	
	 public int subtotalofdresses() {
		 wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.visibilityOfAllElements(subtotal));
		 
		 int sub_total=0;
		 int count=0;
		    
		    for (WebElement s : subtotal) {
		    	count++;
		       String value = s.getText();
		        String cartvalue=value.replaceAll("[^0-9]", "");//to remove non-numeric characters
		        int cartsubttl=Integer.parseInt(cartvalue); //string to integer conversion
		        sub_total+=cartsubttl; 
		        System.out.println(count +".subtotal of item: "+cartsubttl);
		    }
		    System.out.println("subtotal of the total items in cart : "+sub_total);
			return sub_total; 
		   } 
 
		public int  itemprice() {
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			 wait.until(ExpectedConditions.visibilityOf(priceofitems));
			
			String itempricetext=priceofitems.getText(); 
			String price_ofitems=itempricetext.replaceAll("[^0-9]", "");
			int priceinbill=Integer.parseInt(price_ofitems);
			System.out.println("price of all items in final bill: "+ priceinbill);
			return priceinbill;
		} 
		public int  shipping_fee() {
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(shippingfee)); 
		String	shippingtext = shippingfee.getText();
		String shipping=shippingtext.replaceAll("[^0-9]", "");
	int shipping_fee=Integer.parseInt(shipping);
	System.out.println("shipping fee :"+shipping_fee);
	return shipping_fee;
	}
		public int  total_price() {
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(totalamount)); 
			String	totaltext = totalamount.getText();
			String totalamt=totaltext.replaceAll("[^0-9]", "");
		int total_amount=Integer.parseInt(totalamt);
		System.out.println("Final amount including ttl price and shipping charges:"+total_amount);
		return total_amount;
			}
		public void shipping_addrs() {
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(selectaddrs)); 
			selectaddrs.click();
			confirmaddrs.click();
			
		}
		
		public  void confirm_order() {
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(placeorder)); 
			 placeorder.click(); 
		 }
		public void agree_terms() {
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(agreeterms)); 
			agreeterms.click();
		}
		 public void place_order() {
			 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			 wait.until(ExpectedConditions.visibilityOf(plcorder));
			 plcorder.click();
		 }
	public void finalorder_cofrm() {
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(fnlconfirmation));
		fnlconfirmation.click(); 
	} */

//CART PAGE OF ANOTHER ACCOUNT
	@FindBy(xpath="(//*[@class=\"add_cart mb-4\"]//h2)[1]")
	WebElement cartpgtitle;
	@FindBy(xpath="(//*[@class=\"qty-plus\"])[1]")
	WebElement addqty_1;
	@FindBy(xpath="(//div[@class=\"mybag_shadow mobile_size mt-3\"]//div)[1]")
	List <WebElement> cartitems;
	@FindBy(xpath="//*[@class=\"btn changes_address\"]")
	WebElement addadrs;
	@FindBy(xpath="//*[@class=\"col-md-6 mr_bot-22\"]")
	WebElement slcaddrs;
	@FindBy(xpath="(//*[@class=\"pb-2\"]//button)[2]")
	WebElement gotocart;
	@FindBy(xpath="//*[@class=\"cart_inline pad_lt_12\"]//p")
	List<WebElement> subttl; 
	@FindBy(xpath="(//*[@class=\"price_ew_no\"]//span)[1]")
	WebElement cartprice;
	 @FindBy(xpath="//*[@class=\"price_summary pt-3 pb-3\"]/div[2]")
	 WebElement shippingfee;
	 @FindBy(xpath="//*[@class=\"price_summary pt-3 pb-3\"]/div[3]")
	 WebElement totalamount;
	 @FindBy(xpath="//*[@id=\"place-order-button\"]")
	 WebElement placeorder;
	 @FindBy(xpath="//*[@class=\"form-check-input\"][@id=\"agree-terms\"]")
	 WebElement agreeterms;
	 @FindBy(xpath="//*[@class=\"col-md-6 col-lg-7 col-sm-6\"]")
	 WebElement plcorder;
	 @FindBy(xpath="//*[@class=\"swal2-actions\"]/button[1]")
	 WebElement fnlconfirmation;
	 @FindBy(xpath="//*[@class=\"remove_items moveto_wishlists remove_cart\"]")
	 WebElement del_item;
	 @FindBy(xpath="//*[@class=\"swal2-actions\"]/button[1]")
	 WebElement cofrm_msg;
	
	
	public String cart_page_title() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(cartpgtitle)); 
		System.out.println(cartpgtitle.getText());
		return cartpgtitle.getText();
	}
	public void add_qty_of_1st_item() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(addqty_1)); 
		addqty_1.click();
	}
	public void cart_items() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElements(cartitems));
		int count=0;
		for(WebElement cartlist: cartitems)
		{
			count++;
			System.out.println(count +". "+cartlist.getText()); }
	}
	public void add_addrs() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(addadrs)); 
		addadrs.click();
		slcaddrs.click();
		gotocart.click();
	}
	public int sub_total() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfAllElements(subttl));
		int sub_ttl=0;
		int count=0;
		for(WebElement s:subttl) {
			count++;
			String value=s.getText();
			String price1=value.replaceAll("[^0-9]", "");
			int price=Integer.parseInt(price1);
			sub_ttl+=price;
			System.out.println(count+". "+"sub total of the item: "+price);
			}
		System.out.println("Final subtotal of the items in the cart: "+ sub_ttl);		
		return sub_ttl;  		
	}
	public int cart_price() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(cartprice)); 
		String value=cartprice.getText();
		String cart_price1=value.replaceAll("[^0-9]","");
		int cart_price2=Integer.parseInt(cart_price1);
		System.out.println("Total price of the items: "+cart_price2);
		return cart_price2;
	}
	public int  shipping_fee() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(shippingfee)); 
	String	shippingtext = shippingfee.getText();
	String shipping=shippingtext.replaceAll("[^0-9]", "");
int shipping_fee=Integer.parseInt(shipping);
System.out.println("shipping fee :"+shipping_fee);
return shipping_fee;
}
	public int  total_price() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(totalamount)); 
		String	totaltext = totalamount.getText();
		String totalamt=totaltext.replaceAll("[^0-9]", "");
	int total_amount=Integer.parseInt(totalamt);
	System.out.println("Final amount including ttl price and shipping charges:"+total_amount);
	return total_amount;
		}
	public  void confirm_order() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(placeorder)); 
		 placeorder.click(); 
	 }
	public void agree_terms() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(agreeterms)); 
		agreeterms.click();
	}
	 public void place_order() {
		 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOf(plcorder));
		 plcorder.click();
	 }
public void finalorder_cofrm() {
	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOf(fnlconfirmation));
	fnlconfirmation.click();
	
}
public void delete_item() {
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(del_item)); 
	del_item.click();
	cofrm_msg.click(); 
}
	 
	
}
