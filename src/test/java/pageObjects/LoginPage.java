package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@placeholder=\"Username\"]")
	WebElement txtemail;
	@FindBy(xpath="//*[@id='loginPassword']")
	WebElement txtPassword;
	@FindBy(xpath="//*[@id='loginSubmit']")
	WebElement clickSubmit; 
	
	
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
	
	
	

}
 