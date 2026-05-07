package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	@FindBy(xpath="//*[@id=\"carouselExampleControls\"]/div/div[1]/img")
	WebElement shopnow;
	
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
	public void shop_now() {
		shopnow.click();
	}

//SEARCH BOX AND LOGO
	@FindBy(xpath="//*[@class=\"logo_img\"]")
	WebElement urllogo;
	@FindBy(xpath="//*[@class=\"dropdown\"]")
	WebElement linkcurrency;
	@FindBy(xpath="//*[@class=\"dropdown\"]/ul/li[1]") 
	WebElement slctcurrency;
	@FindBy(xpath="//input[@placeholder=\"Search by product\"]")
	WebElement searchbar;
	//product selection through search bar
	
	@FindBy(xpath="//*[@class=\"suggestion-list list-unstyled\"]")
	WebElement searchword;
	@FindBy(xpath="//*[@id=\"carouselProduct23\"]")
	WebElement product1;
	@FindBy(xpath="(//*[@id=\"sizeList23\"]//div)[3]")
	WebElement sizexl_of_prod_1;
	@FindBy(xpath="//*[@id=\"buyNow23\"]")
	WebElement buy_product1;
	
	
	
	
	
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
	
	public void search_box(String searchingtxt) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15)); 
		wait.until(ExpectedConditions.visibilityOf(searchbar)); 
		searchingtxt ="jodhpuris";
		action=new Actions(driver);
		action.moveToElement(searchbar).click().sendKeys(searchingtxt).build().perform();
		action.moveToElement(searchword).click().build().perform();	
	} 
	public void product_selection() {
		wait =  new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(product1));
		action= new Actions(driver);
		action.moveToElement(product1).build().perform();
		wait.until(ExpectedConditions.visibilityOf(sizexl_of_prod_1));
		sizexl_of_prod_1.click();
		wait.until(ExpectedConditions.visibilityOf(buy_product1)); 
		buy_product1.click();
	}
	
//Bottom links
	@FindBy(xpath="//*[@class=\"widget_about\"]")
	WebElement regaddrs;
	@FindBy(xpath="//*[@class=\"col-md-6 col-lg-2 col-sm-6\"][1]//a")
List <WebElement> usefullinks;
	@FindBy(xpath="//*[@class=\"col-md-6 col-lg-2 col-sm-6\"][2]//a")
	List<WebElement> shopby;
	@FindBy(xpath="//*[@class=\"col-md-6 col-lg-2 col-sm-6\"][3]//a")
	List<WebElement> myaccountlinks;
	@FindBy(xpath="//*[@class=\"text-center mb-4\"]")
	WebElement about_us;
	@FindBy(xpath="//*[@class=\"add_cart mb-4\"]")
	WebElement terms_conditionpg;
	@FindBy(xpath="//*[@class=\"add_cart mb-4\"]")
	WebElement faqs;
	@FindBy(xpath="//*[@class=\"add_cart mb-4\"]")
	WebElement exchgpolicy;
	@FindBy(xpath="//*[@class=\"text-center mb-4\"]")
	WebElement cntc_us;
	@FindBy(xpath="//*[@class=\"add_cart mb-4\"]")
	WebElement privacypolicy;
	
	@FindBy(xpath="//*[@class=\"add_cart mb-4\"]")
	List<WebElement> text_in_page; 
	@FindBy(xpath="//*[@class=\"text-center mb-4\"]")
	List<WebElement> text_in_page_1;
	
	
	
	
	public void Reg_addrs() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(regaddrs));
		regaddrs.getText();
		System.out.println(regaddrs.getText());
	}
	
	public void useful_links() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {	
		for (int i = 0; i < usefullinks.size(); i++) {
		List<WebElement> linksList = wait.until(ExpectedConditions.visibilityOfAllElements(usefullinks));
		System.out.println("Total links available: " + linksList.size());
		    WebElement link = linksList.get(i);
		     JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("arguments[0].scrollIntoView(true);", link);
		     System.out.println("Clicking link: " + link.getText());
		     link.click();
		      driver.navigate().back();
		        }

		    } catch (Exception e) {
		        System.out.println("Exception occurred: " + e.getMessage());
		        e.printStackTrace();
		    } 	}
	
	
	public void useful_links_pgtext() throws InterruptedException {
		int count=usefullinks.size();
		for(int i=0;i<count;i++) 
		{
			wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfAllElements(usefullinks));
			
			System.out.println(usefullinks.get(i).getText());
			usefullinks.get(i).click();
			try {
			for(int j=0;j<count;j++) {
				wait=new WebDriverWait(driver,Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfAllElements(text_in_page));
				System.out.println("Header of the page: "+text_in_page.get(j).getText());}
			}
				catch(Exception e) {
				System.out.println("Error message " +e.getMessage());
			}
		}
}		

	public void Shop_by() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		try {
			int count = shopby.size();
			for(int i=0 ; i < count; i++) 
			{
			List<WebElement> shopbylinks=wait.until(ExpectedConditions.visibilityOfAllElements(shopby));
			WebElement pgdwnlinks= shopbylinks.get(i);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", pgdwnlinks);
			System.out.println("clicking the links:" + pgdwnlinks.getText());
			pgdwnlinks.click();
			wait.until(ExpectedConditions.urlContains("http"));
			driver.navigate().back();
			wait.until(ExpectedConditions.visibilityOfAllElements(shopby));		}
			}
		catch(Exception e){
			System.out.println("Exception occured:" + e.getMessage());
			e.printStackTrace();
		}
		}
	public void my_account_links() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(15));
		int count=myaccountlinks.size();
		System.out.println("Total no of links: "+ count);
		for(int i=0;i<count;i++) {
			wait.until(ExpectedConditions.visibilityOfAllElements(myaccountlinks));
			System.out.println(myaccountlinks.get(i).getText());
			myaccountlinks.get(i).click();
			}
}
}