package pageObjects;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//constructor
public class HomePage extends BasePage{

	public WebDriverWait wait;
	public Actions action;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//For Login and register
	@FindBy(xpath="(//*[@class=\"list-inline m-0\"]//i)[1]")
	WebElement account;
	@FindBy(xpath="//*[@id='loginMenu']/li/a[1]")
	WebElement linkLogin;
	@FindBy(xpath="//ul[@id='loginMenu']//a[2]")
	WebElement linkRegister;
	
	public void Account() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(account));
		action = new Actions(driver);
		action.moveToElement(account).build().perform();
		}

	public void clickLogin() throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(linkLogin));
		linkLogin.click();
	   }  
	
	public void	clickRegister() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement  clickRegister= wait.until(ExpectedConditions.elementToBeClickable(linkRegister));		
		clickRegister.click();	 
		}
//shopping links
	 @FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[7]")
	 WebElement linksherwanis;
	 
	 public void sherwanis() {
		 linksherwanis.click();
	 }
	 
	 @FindBy(xpath="//*[@data-productid=\"17\"][@id=\"size-4\"]")
	 WebElement linkdresssize;
	 public void dresssize() {
		 linkdresssize.click();
	 }
	 
	 @FindBy(xpath="//*[@id=\"buyNow17\"]")
	 WebElement buynow;
	 
	 public void selecteddress() {
		 buynow.click();
	 }
	
	
	
	
	
	
	
	

}
