package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
 



public class LoginPage extends BasePage {
	public Actions action;
	public WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void executescript() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='50%'");}
	
	@FindBy(xpath="//*[@placeholder=\"Username\"]")
	WebElement txtemail;
	@FindBy(xpath="//*[@id='loginPassword']")
	WebElement txtPassword;
	@FindBy(xpath="//*[@id='loginSubmit']")
	WebElement clickSubmit; 
	
//ACCOUNT_DETAILS_OPTIONS
	@FindBy(xpath="//*[@id=\"userMenu\"]/li[1]/a")
	WebElement accountname;
	@FindBy(xpath="//*[@id=\"userMenu\"]/li[2]")
	WebElement linkaccountdetails;
	@FindBy(xpath="(//*[@class=\"list-unstyled\"][@id=\"userMenu\"]/li/a)[3]")
	WebElement linkwishlist;
	@FindBy(xpath="//*[@id=\"userMenu\"]/li[4]/a")
	WebElement linkorders;
	@FindBy(xpath="//*[@id=\"userMenu\"]/li[5]")
	WebElement linkaddresses;
    @FindBy(xpath="(//*[@id=\"userMenu\"]/li[6]/a)")
    WebElement linklogout;
		 
	public void setEmail(String email)
	{	wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.sendKeys(email);
	}
	public void setPassword(String password)
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(txtPassword));
		txtPassword.sendKeys(password);
	}
	public void btnSignin() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(clickSubmit));
		clickSubmit.click();
	}
//AFTER LOGIN 	
	public String account_name()
	{
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(accountname));
		System.out.println(accountname.getText());
		return accountname.getText(); 
	} 
	public void account_details()
	{
		WebDriverWait accdetails=new WebDriverWait(driver,Duration.ofSeconds(10));
		accdetails.until(ExpectedConditions.visibilityOf(linkaccountdetails));
		linkaccountdetails.click();
	}
	public void wishlist()
	{
		WebDriverWait wishlist=new WebDriverWait(driver,Duration.ofSeconds(15));
		wishlist.until(ExpectedConditions.visibilityOf(linkwishlist));
		linkwishlist.click(); 
	}
	public void orders() {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.elementToBeClickable(linkorders));
		 linkorders.click();
	}
	public void address_page() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(linkaddresses));
			linkaddresses.click(); 
		} 
	public void logout() {
		WebDriverWait logout=new WebDriverWait(driver,Duration.ofSeconds(15));
		logout.until(ExpectedConditions.visibilityOf(linklogout));
		linklogout.click();
	}
	
//PROFILE PAGE OR ACCOUNT DETAILS PAGE
	@FindBy(xpath="//*[@class=\"profile_left\"]/h5")
	WebElement prfacc_username;
	@FindBy(xpath="//*[@class=\"nav-link\"]")
	WebElement toreset_password;
	//new password
	//confirm password
	@FindBy(xpath="//*[@id=\"userUpdate_FirstName\"]")
	WebElement enterfirst_name;
	@FindBy(xpath="//*[@id=\"userUpdate_LastName\"]")
	WebElement txtlastname; 
	@FindBy(xpath="//*[@id=\"dateOfBirth\"]")
	WebElement dateofbirth; 
	@FindBy(xpath="//*[@id=\"maleOption\"]")
	WebElement btngender;
	@FindBy(xpath="//*[@id=\"custom-dropdown-primary\"]")
	WebElement country_code; 
	@FindBy(xpath="//*[text()='+91']")
	WebElement countryoption;
	@FindBy(xpath="//*[@id=\"userUpdate_PhoneNumber\"]")
	WebElement phonenumber;
	@FindBy(xpath="//*[@class=\"form-control\"][@id=\"imageName\"]")
	WebElement profilepic;
	@FindBy(xpath="//*[@class=\"editprofile\"]")
	WebElement btnsave;
	@FindBy(xpath="//*[@class=\"cancelcustombtn cancel-decoration\"]")
	WebElement cancel; 
	public String profile_name() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(prfacc_username));
		System.out.println(prfacc_username.getText());
		return prfacc_username.getText();	}
	public void reset_password() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(toreset_password));
		toreset_password.click();
	}
	public void txtfirst_name() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(enterfirst_name));
		enterfirst_name.clear();
		enterfirst_name.sendKeys("palivelasridhar1");
	}
	public void last_name() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtlastname));
		txtlastname.clear();
		txtlastname.sendKeys("kumar"); 
	}
	public void date_of_birth() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(dateofbirth));
		dateofbirth.sendKeys("15-08-1990"); 
	}
	public void selectgender() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(btngender));		
		btngender.click(); 
	}
	public void country_drop_down() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(country_code));
		country_code.click();
	}
	public void countrycode_selection() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(countryoption));
		countryoption.click();
		}
	public void mobile_number() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(phonenumber)); 
		phonenumber.sendKeys("0123456789");
	}
	public void save() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(btnsave));  
		btnsave.click();
	} 
	public void cancel() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(cancel));
		cancel.click();
	}
	
//WISHLISTING PRODUCTS
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]/li[2]")
	WebElement linksuits;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[5]")
	WebElement suit5;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]/li[3]")
	WebElement linkjodhpuris;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[3]")
	WebElement jodhpuri3;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[5]")
	WebElement jodhpuri5;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]/li[4]")
	WebElement linkkurtapajmas;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[2]")
	WebElement kurta2;
	
//IN WISHLIST PAGE
	@FindBy(xpath="//*[@id=\"wishlist-count\"]")
	WebElement wishlistitems;
	@FindBy(xpath="//h4[@class='pad_bot_2 pt-0 w-100 pe-0']")
	List <WebElement> productnames;
	@FindBy(xpath="(//*[@class=\"pad_bot_2 pt-0 w-100 pe-0\"])[1]")
	WebElement productname;
	
	
	public void clicksuits()
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(linksuits));
		linksuits.click();
	}
	public void selectsuit() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(suit5));
		suit5.click();
	}
	public void clickjodhpuri() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(linkjodhpuris));
	linkjodhpuris.click();}
	
	public void selectjodhpuri3() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(jodhpuri3));
		jodhpuri3.click();
	}
	public void selectjodhpiri5() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(jodhpuri5));
	jodhpuri5.click();}
	
	public void clickkurtapajamas() {  
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(linkkurtapajmas));
	linkkurtapajmas.click();}
	public void selectkurta() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(kurta2));
		kurta2.click(); 
	}
	
	public void wishlist_count() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(wishlistitems)); 
		System.out.println("left side count in page: "+wishlistitems.getText());
	}
	public void product_names() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(productnames)); 
		int count = 0;
		for(WebElement p:productnames) { 
		count++;	
		System.out.println(count +".product name :"+ p.getText());
		}
		System.out.println("Total wishlisted items: " + count);
	}
	public String product_name() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(productname));  
		return productname.getText();
	}
	
	//TO ORDER FROM WISHLIST
	@FindBy(xpath="//*[@class=\"d-block w-100\"][@alt=\"Formal 3-piece suit\"]")
	WebElement dress1;
	@FindBy(xpath="//*[@id=\"sizeList10\"]/li[3]")
	WebElement dress1_sizelarge;
	@FindBy(xpath="//*[@id=\"moveToCart10\"]")
	WebElement cart1;
	@FindBy(xpath="//img[@alt=\"Designer Royal Jodhpuri Suit\"]")
	WebElement dress3;
	@FindBy(xpath="//*[@id=\"sizeList21\"]/li[2]")
	WebElement dress3_sizelarge;
	@FindBy(xpath="//*[@id=\"moveToCart21\"]")
	WebElement cart_2;
	public void product1_size() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		action=new Actions(driver); 
		action.moveToElement(dress1).perform();
		wait.until(ExpectedConditions.visibilityOf(dress1_sizelarge));
		dress1_sizelarge.click();
		}
	public void movetocart_1() {  
		action=new Actions(driver); 
		action.moveToElement(cart1).perform();
		WebDriverWait cart=new WebDriverWait(driver,Duration.ofSeconds(15)); 
		cart.until(ExpectedConditions.elementToBeClickable(cart1));
		cart1.click();
	}
	 public void product3_size() {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			action=new Actions(driver); 
			action.moveToElement(dress3).perform();
			wait.until(ExpectedConditions.visibilityOf(dress3_sizelarge)); 
			dress3_sizelarge.click();  
	 }
	 public void movetocart_2() { 
		 action=new Actions(driver); 
			action.moveToElement(cart_2).perform(); 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15)); 
			wait.until(ExpectedConditions.elementToBeClickable(cart_2));
		 cart_2.click();  
	 } 
	 
//ADDRESS PAGE
	 @FindBy(xpath="//*[@class=\"h-10 addsprofile\"]")
	 WebElement add_new_addrs;
	 @FindBy(xpath="//*[@id=\"name\"]")
	 WebElement name;
	 @FindBy(xpath="//*[@id=\"editCountry\"]")
	 WebElement country;
	 @FindBy(xpath="//*[@id=\"stateName\"]")
	 WebElement state;
	 @FindBy(xpath="//*[@id=\"editCity\"]")
	 WebElement city;
	 @FindBy(xpath="//*[@id=\"editPinCode\"]")
	 WebElement pincode;
	 @FindBy(xpath="//*[@id=\"editAddress\"]")
	 WebElement address;
	 @FindBy(xpath="//*[@id=\"dropdown-container\"]")
	 WebElement countrycode;
	 @FindBy(xpath="//*[@id=\"dropdown-options\"]/div[1]")
	 WebElement slctcode;
	 @FindBy(xpath="//*[@id=\"editPhoneNo\"]")
	 WebElement phnno;
	 @FindBy(xpath="//*[@class=\"form-check form-check-inline\"][1]")
	 WebElement addrstype;
	 @FindBy(xpath="//*[@id=\"saveAddressButton\"]")
	 WebElement saveaddrs;
	 @FindBy(xpath="//*[@id=\"editIsDefault\"]")
	 WebElement makedefaultaddrs;
	 @FindBy(xpath="//*[@id=\"cancelbutton\"]")
	 WebElement canceldetails;
	 @FindBy(xpath="//*[@class=\"swal2-actions\"]")
	 WebElement okbutton;
	 
	 
/*	 public void click_to_add_addrs() {
			wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(add_new_addrs)); 
		 add_new_addrs.click();
	 }
	 public void name_in_addrs() {
		 wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(name));
		 name.sendKeys("Sridhar");
	 }
	 public void country_in_addrs() {
		 wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(country));
		 country.click(); 
		 Select s=new Select(country);
		 s.selectByVisibleText("India");
	 }
	public void state_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(state));
		state.sendKeys("Telanagana");
	}
	public void city_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(city));
		city.sendKeys("Hyderbad");
		}
	public void picode_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(pincode));
		pincode.sendKeys("500045");
	}
	public void address_in() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(address));
		address.sendKeys("h.no:32, rajeev nagar, s r nagar.");
	}
	public void countrycode_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(countrycode));
		countrycode.click();
		slctcode.click();
	}
	public void phn_number() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(phnno));
		phnno.sendKeys("0123456789");
	}
	public void addrs_type() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(addrstype));
		addrstype.click();
	}
	public void default_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(makedefaultaddrs));
		makedefaultaddrs.click();
	}
	public void save_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(saveaddrs));
		saveaddrs.click();
	}
	public void cancel_given_details() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(canceldetails));
		canceldetails.click(); 
	}
	public void ok_button() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(okbutton)); 
		okbutton.click();
	}  */
	 
	 
//ADD NEW ADDRESS IN ANOTHER ACCOUNT
	 public void click_to_add_addrs() {
			wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(add_new_addrs)); 
		 add_new_addrs.click();
	 }
	 public void name_in_addrs() {
		 wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(name));
		 name.sendKeys("SUMA");
	 }
	 public void country_in_addrs() {
		 wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(country));
		 country.click(); 
		 Select s=new Select(country);
		 s.selectByVisibleText("India");
	 }
	public void state_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(state));
		state.sendKeys("Telanagana");
	}
	public void city_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(city));
		city.sendKeys("HYDERABAD");
		}
	public void picode_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(pincode));
		pincode.sendKeys("500092");
	}
	public void address_in() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(address));
		address.sendKeys("H.NO:8-16, HEMANAGAR, BODUPPAL.");
	}
	public void countrycode_in_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(countrycode));
		countrycode.click();
		slctcode.click();
	}
	public void phn_number() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(phnno));
		phnno.sendKeys("0123456789");
	}
	public void addrs_type() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(addrstype));
		addrstype.click();
	}
	public void default_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(makedefaultaddrs));
		makedefaultaddrs.click();
	}
	public void save_addrs() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(saveaddrs));
		saveaddrs.click();
	}
	public void cancel_given_details() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(canceldetails));
		canceldetails.click(); 
	}
	public void ok_button() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(okbutton)); 
		okbutton.click();
	}

//NEGATIVE TESTING
		
//1. SUBMITTING EMPTY FIELDS FOR LOGIN	
	@FindBy(xpath="//*[text()='Please enter a valid email.']")
	WebElement validemailmsg;
	@FindBy(xpath="//*[text()='Please enter a valid password.']")
	WebElement validpswdmsg;
	
	public String set_email_empty(String email) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.sendKeys(email);
		return email;
	}
	public String set_pswd_empty(String pswd) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(txtPassword));
		txtPassword.sendKeys(pswd);
		return pswd;  
	}
	public void click_submit() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(clickSubmit));
		clickSubmit.click(); 
	} 
	public String  error_mail_msg() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(validemailmsg));
		return validemailmsg.getText();
	}
	public String error_pswd_msg() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(validpswdmsg));
		return validpswdmsg.getText(); 
	}
//2.ENTERING INVALID LOGIN CREDENTIALS
	@FindBy(xpath="//*[text()='User not found. Please register first.']")
	WebElement invalidmailmsg;
	@FindBy(xpath="//*[text()='Your password is invalid. Please try again.']")
	WebElement invalidpswdmsg;
	public String set_invalid_email(String email) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.sendKeys(email);
		return email;	
	}
	public String set_invalid_pwsd(String pswd) {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(txtPassword));
		txtPassword.sendKeys(pswd);
		return pswd;
		}
	public String invalid_mail_msg() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(invalidmailmsg));
		return invalidmailmsg.getText(); 
	}
	public String invalid_pswd_msg() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(invalidpswdmsg));
	return invalidpswdmsg.getText();
	} 
	
	
	
	
}
 