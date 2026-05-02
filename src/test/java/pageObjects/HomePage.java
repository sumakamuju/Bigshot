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
	
	
//For RIGHT LIST
	@FindBy(xpath="(//*[@class=\"list-inline m-0\"]//i)[1]")
	WebElement account;
	@FindBy(xpath="//*[@id='loginMenu']/li/a[1]")
	WebElement linkLogin;
	@FindBy(xpath="//ul[@id='loginMenu']//a[2]")
	WebElement linkRegister;
	@FindBy(xpath="//*[@id=\"wishlistIcon\"]//a")
	WebElement wishlisticon;
	@FindBy(xpath="//*[@id=\"CartIcon\"]")
	WebElement carticon;
	
	public void Account() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(account));
		action = new Actions(driver);
		action.moveToElement(account).build().perform();
		}
	public void WishlistIcon() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.elementToBeClickable(wishlisticon));
		wishlisticon.click();	
		} 
	public void Cart_Icon() {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.elementToBeClickable(carticon));
		 carticon.click();
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

//TOP CONTAINER OPTIONS
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[1]")
	WebElement linkHome;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[2]")
	WebElement linkSuits;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[3]")
	WebElement linkJodhpuris;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[4]")
	WebElement linkKurtaPajamas;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[5]")
	WebElement linkPathanisuits;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[6]")
	WebElement linkJacketkurtasets;
	 @FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[7]")
	 WebElement linksherwanisIndoWestern; 
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[8]")
	WebElement linkblazors;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]//li[9]")
	WebElement linkaccessories;
	
	public void homeoption() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkHome));
		linkHome.click();
	}
	public void suits() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkSuits));
		linkSuits.click();
	}
	public void jodhpuris() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkJodhpuris));
		linkJodhpuris.click();
	}
	public void kurtapajamas() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkKurtaPajamas));
		linkKurtaPajamas.click();
	}
	public void pathanisuits() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkPathanisuits));
		linkPathanisuits.click();
	}
	public void jacketkurtasets() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkJacketkurtasets));
		linkJacketkurtasets.click();
	}
	public void sherwanis_indowestern() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linksherwanisIndoWestern));
		 linksherwanisIndoWestern.click();
	 }
	public void blazors() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkblazors));
		linkblazors.click();
	}
	public void accessories() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(linkaccessories));
		linkaccessories.click();
	}

//SEARCH BOX AND LOGO
	@FindBy(xpath="//*[@class=\"logo_img\"]")
	WebElement urllogo;
	@FindBy(xpath="//*[@class=\"dropdown\"]")
	WebElement linkcurrency;
	@FindBy(xpath="//*[@class=\"dropdown\"]/ul/li[1]") 
	WebElement slctcurrency;
	@FindBy(xpath="//*[@class=\"search_list\"]")
	WebElement searchbar;
	
	public boolean company_logo() {  
		wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(urllogo));
		System.out.println(urllogo.isDisplayed());
		return urllogo.isDisplayed();  
		}
	public void currency() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(linkcurrency));
		linkcurrency.click();
		slctcurrency.click();
	}
	
	public void search_box() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait.until(ExpectedConditions.visibilityOf(searchbar)); 
 new Actions(driver).moveToElement(searchbar).click().sendKeys("suits").perform();
		}

	
	
	
	

	 
	
	
	
	
	
	
	

}
