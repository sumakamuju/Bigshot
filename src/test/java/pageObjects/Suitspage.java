package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suitspage extends BasePage {
	public WebDriverWait wait;
	public Actions action;
	public JavascriptExecutor js;

	public Suitspage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"sortBySelect\"]")
	WebElement drpdwnsortby;
	@FindBy(xpath="//*[@id=\"carouselProduct9\"]")
	WebElement sel_suit_1; 
	@FindBy(xpath="//*[@id='sizeList9']//li[2]/div")
	WebElement suit_1_size;
	@FindBy(xpath="//*[@id=\"addToCart9\"]")
	WebElement add_suit1_to_cart;
	@FindBy(xpath="//*[@id=\"carouselProduct11\"]")
	WebElement sel_suit_2;
	@FindBy(xpath="//*[@id='sizeList11']//li[3]//div")
	WebElement suit_2_size;
	@FindBy(xpath="//*[@id=\"addToCart11\"]")
	WebElement add_suit2_to_cart;
	
	
	
	public void sort_by_option() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drpdwnsortby));
		Select s=new Select(drpdwnsortby);
		s.selectByVisibleText("Price Low to High"); 
	}
	public void move_suit1_to_cart() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(sel_suit_1));
		action = new Actions(driver);
		action.moveToElement(sel_suit_1).perform();
		suit_1_size.click();
		add_suit1_to_cart.click();	
	}
	public void move_suit2_to_cart() {
		js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", sel_suit_2);
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(sel_suit_2));
		action = new Actions(driver);
		action.moveToElement(sel_suit_2).perform();
		suit_2_size.click();
		add_suit2_to_cart.click();
	}
	
	

}
