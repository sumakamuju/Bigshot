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
	@FindBy(xpath="//*[@class=\"col-9\"]/div[2]/input[1]")//female option, change div and input for options
	WebElement slctgender;
	@FindBy(xpath="//*[@class=\"col-9\"]/div[1]/input[1]")//male option
	WebElement slctgendermale;
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
	public void select_gender_male() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(slctgendermale)); 	
		slctgendermale.click(); 
	}
	public void sign_up() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(clicksignup)); 	 
		clicksignup.click();
	}
	
//NEGATIVE TESTING

//1. LEAVING NAME FIELDS EMPTY
	@FindBy(xpath="//*[@id=\"FirstNameError\"]")
	WebElement fstnameerr;
	@FindBy(xpath="//*[@id=\"LastNameError\"]")
	WebElement lstnameerr;
	
	public String fst_name_requrd() {
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(fstnameerr));
		return fstnameerr.getText();
	}
	public String lst_name_requrd() {
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(lstnameerr));
		return lstnameerr.getText();
	} 
//2. LEAVING  MAIL ID FIELD EMPTY	
@FindBy(xpath="//*[@id=\"EmailError\"]")
WebElement emailerr;

public String email_err_msg() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(emailerr));
	return emailerr.getText(); 
}
//3. WITH BOTH EMPTY PASSWORD & CONFIRM  PASSWORD FIELDS
@FindBy(xpath="//*[@id=\"PasswordError\"]")
WebElement pswderr;
@FindBy(xpath="//*[@id=\"ConfirmPasswordError\"]")
WebElement cnfmpswderr;

public String empty_pswd() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(pswderr));
	return pswderr.getText(); 
}
public String empty_cnfm_pswd() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(cnfmpswderr));
	return cnfmpswderr.getText(); 
}
//4.EMPTY PASSWORD FIELD  
public String empty_pswd_only() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(pswderr));
	return pswderr.getText();  }
public String cnfm_pswd_msg() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(pswderr));
	return cnfmpswderr.getText();  
}
//5.EMPTY CONFIRM PASSWORD FIELD
public String empty_cnfm_pswd_only() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(cnfmpswderr));
	return cnfmpswderr.getText();  
} 
//6.EMPTY PHONE NUMBER
@FindBy(xpath="//*[@id=\"phoneError\"]")
WebElement phnnoerr;
public String empty_phn_no() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(phnnoerr));
	return phnnoerr.getText();
} 
 
//7.ENTERING INVALID MAIL FORMAT
@FindBy(xpath="//*[@id=\"EmailError\"]")
WebElement invalidmail;

public String invalid_mail() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(invalidmail));
	return invalidmail.getText(); 
}
//8.ENTERING WEAK PASSWORDS

public String weak_pswd_entry() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(pswderr));
	return pswderr.getText();
	}
//9.PASSWORDS MISMATCH


public String pswd_mismatch() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(cnfmpswderr));
	return cnfmpswderr.getText(); 
} 
//10.REGISTERING WITH ALREADY EXISTING MAIL ID
@FindBy(xpath="//*[@id=\"RegistartionError5\"]")
WebElement registeredmailid;

	public String reg_mail_id() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(registeredmailid)); 
	return registeredmailid.getText();
		}
//11.USE SPECIAL CHARACTERS IN NAME FIELDS
@FindBy(xpath="//*[@id=\"LastNameError\"]")
WebElement splcharnames;

	public String name_with_spl_char() {
		wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(splcharnames)); 
		return splcharnames.getText();
	}
//12.ENTERING ONLY FIRST NAME WIHTOUT LAST NAME
@FindBy(xpath="//*[@id=\"LastNameError\"]")
WebElement emptylstname;

public String empty_lst_name_field() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(emptylstname)); 
	return emptylstname.getText();
} 
//13.ENTERING PHONE NUMBER WITH LESS THAN 10 DIGITS
public String phn_err_less_digits() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(phnnoerr)); 
	return phnnoerr.getText(); 
}

//14.EMPTY GENDER FIELD
@FindBy(xpath="//*[@id=\"RegistartionError5\"]")
WebElement emptygender;
public String empty_gender_reg() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(emptygender));  
	return emptygender.getText();
}

	
//15.ENTER EXTREMELY LONG INPUT STRINGS
@FindBy(xpath="//*[@id=\"RegistartionError5\"]")
WebElement longinpstrings;
public String long_strings() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(longinpstrings));
	return  longinpstrings.getText(); 
}

//16.SPECIAL CHARACTERS IN PHONE NUMBER
public String spl_char_phn_no() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(phnnoerr)); 
	return phnnoerr.getText(); 
}
//17.PHN NUMBER WITH MORE THAN 10 DIGITS
@FindBy(xpath="//*[@id=\"RegistartionError5\"]")
WebElement regerr;
public String regerrmsg() {
	wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(regerr));
	return regerr.getText(); 
			}
	
	 
	
}
