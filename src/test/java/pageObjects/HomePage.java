package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
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
	@FindBy(xpath="(//*[@class=\"list-inline m-0\"]//i)[1]")
	WebElement account;
			

	@FindBy(xpath="(//*[@id=\"loginMenuItem\"]//a)[1]")// login
	WebElement linkLogin;
	@FindBy(xpath="//ul[@id=\"loginMenu\"]//a[2]")// register
	WebElement linkRegister;
	
	public void Account() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(account));
		action = new Actions(driver);
		action.moveToElement(account).build().perform();
		}

	public void clickLogin() throws InterruptedException {
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id=\"loginMenuItem\"]//a)[1]")));

		loginBtn.click();
	   }
	
	public void	clickRegister() {
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement  clickRegister= wait.until(ExpectedConditions.elementToBeClickable(linkRegister));		
		clickRegister.click();	 
		}

	 
	
	
	
	
	
	
	
	

}
