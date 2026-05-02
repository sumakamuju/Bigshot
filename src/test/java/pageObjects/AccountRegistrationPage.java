package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage{
	public WebDriverWait wait;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		}

	@FindBy(xpath="//*[@id=\"FirstNameInput\"]")
	WebElement txtfstname;
	@FindBy(xpath="//*[@id=\"LastNameInput\"]")
	WebElement txtlstname;
	@FindBy(xpath="//*[@id=\"EmailInput\"]")
	WebElement txtemail;
	@FindBy(xpath="//*[@id='registrationPassword']")
	WebElement txtpswd;
	@FindBy(xpath="//*[@id=\"registrationConfirmPassword\"]")
	WebElement txtcnfrmpswd;
	@FindBy(xpath="//*[@id=\"custom-dropdown\"]")
	WebElement slctcountrycode;
	@FindBy(xpath="//*[text()='India - +91']")
	WebElement slctcountryoption;
	@FindBy(xpath="//*[@id=\"phoneinput\"]")
	WebElement txtphnno;
	@FindBy(xpath="//*[@class=\"col-9\"]/div[2]/input[1]")//change div and input for options
	WebElement slctgender;
	@FindBy(xpath="//*[@id=\"signup\"]")
	WebElement clicksignup;
	
	
	public void first_name(String fstname) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtfstname));
		txtfstname.sendKeys(fstname);
	}
	public void last_name(String lstname) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtlstname));
		txtlstname.sendKeys(lstname);
	}
	public void email_id(String email) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtemail));
		txtemail.sendKeys(email);
	} 
	public void password(String pswd) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtpswd));
		txtpswd.sendKeys(pswd); 
	}
	public void confirmpswd(String cnfmpswd) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtcnfrmpswd)); 
		txtcnfrmpswd.sendKeys(cnfmpswd);
	}
	public void country_code() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(slctcountrycode));  
		slctcountrycode.click();
	}
	public void country_optn() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(slctcountryoption)); 
		slctcountryoption.click(); 
	}
	public void phnnumbr(String phno) { 
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txtphnno)); 		
		txtphnno.sendKeys(phno);
	}
	public void select_gender() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(slctgender)); 	
		slctgender.click(); 
	}
	public void sign_up() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(clicksignup)); 	 
		clicksignup.click();
	}
	
	
	
}
