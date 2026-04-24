package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		}
	//locators
	@FindBy(xpath="//*[@class=\"list-inline-item menu_drop\"]")
	WebElement linkMyAccount;
	
	
	public void my_account()
	{
		linkMyAccount.click();
	}
	

}
