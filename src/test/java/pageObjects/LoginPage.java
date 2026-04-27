package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage extends BasePage {
	
	

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
	
	//ACCOUNT_DETAILS_BUTTON
	@FindBy(xpath="//*[@id=\"userAccountMenu\"]")
	WebElement accountname;
	@FindBy(xpath="//*[@id=\"userMenu\"]/li[2]")
	WebElement linkaccountdetails;
	@FindBy(xpath="//*[text()=' Wishlist']")
	WebElement linkwishlist;
	@FindBy(xpath="//*[text()=' Orders']")
	WebElement linkorders;
	@FindBy(xpath="//*[text()='Addresses']")
	WebElement linkaddresses;
    @FindBy(xpath="(//*[@id=\"userMenu\"]/li[6]/a)")
    WebElement linklogout;
		
	public void setEmail(String email)
	{	
		//txtemail.click();
		txtemail.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void btnSignin() { 
		clickSubmit.click();
	}
	
	
	
	public String account_name()
	{
		return accountname.getText();
		
	} 
	public void account_details()
	{
		WebDriverWait accdetails=new WebDriverWait(driver,Duration.ofSeconds(10));
		accdetails.until(ExpectedConditions.visibilityOf(linkaccountdetails));
		linkaccountdetails.click();
	}
	public void whishlist()
	{
		linkwishlist.click(); 
	}
	
	
	//account details page or profile page
	@FindBy(xpath="//*[@class=\"profile_left\"]/h5")
	WebElement acc_username;
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
	public void profile_name() {
		WebDriverWait profilename=new WebDriverWait(driver,Duration.ofSeconds(10));
		profilename.until(ExpectedConditions.visibilityOf(acc_username));
		acc_username.getText();
		System.out.println(acc_username);	}
	public void reset_password() {
		toreset_password.click();
	}
	public void txtfirst_name() {
		WebDriverWait first_name= new WebDriverWait(driver,Duration.ofSeconds(10));
		first_name.until(ExpectedConditions.visibilityOf(enterfirst_name));
		enterfirst_name.clear();
		enterfirst_name.sendKeys("palivelasridhar1");
	}
	public void last_name() {
		txtlastname.clear();
		txtlastname.sendKeys("kumar");
	}
	public void date_of_birth() {
		dateofbirth.sendKeys("15-08-1990");
	}
	public void selectgender() {
		WebDriverWait gender= new WebDriverWait(driver,Duration.ofSeconds(20));
		gender.until(ExpectedConditions.visibilityOf(btngender));		
		btngender.click(); 
	}
	public void country_drop_down() {
		WebDriverWait country= new WebDriverWait(driver,Duration.ofSeconds(10));
		country.until(ExpectedConditions.visibilityOf(btngender));
		country_code.click();
	}
	public void countrycode_selection() {
		WebDriverWait selectcountry= new WebDriverWait(driver,Duration.ofSeconds(10));
		selectcountry.until(ExpectedConditions.visibilityOf(countryoption));
		countryoption.click();
		}
	public void mobile_number() {
		phonenumber.sendKeys("0123456789");
	}
	public void save() {
		btnsave.click();
	} 
	public void cancel() {
		cancel.click();
	}
	
	
	
	//wish list
	@FindBy(xpath="//*[@id=\"wishlist-count\"]")
	WebElement wishlistitems;
	@FindBy(xpath="//*[@class=\"filter_pad_pro card_pad_whish text-center flex_whishlist\"]")
	WebElement listname;
	@FindBy(xpath="(//*[@class=\"remove_whishlist\"]//span//i)[1]")
	WebElement deleteitem;
	public void wishlist_count() {
		wishlistitems.getText();
		System.out.println(wishlistitems);
	}
	public void list_itemname() {
		listname.getText();
		System.out.println(listname);
	}
	public void del_item() {
		deleteitem.click();
	}
	
	
	//ORDERS
	public void orders() {
		linkorders.click();
	}
	//ADDRESSES
	public void addresses() {
		linkaddresses.click();
	}
	//LOGOUT
public void logout() {
	WebDriverWait logout=new WebDriverWait(driver,Duration.ofSeconds(15));
	logout.until(ExpectedConditions.visibilityOf(linklogout));
	linklogout.click();
}

 
}
 