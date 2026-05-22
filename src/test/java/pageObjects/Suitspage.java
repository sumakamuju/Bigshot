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
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[5]")
	WebElement suit5;
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
	
	
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]/li[3]")
	WebElement linkjodhpuris;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[3]")
	WebElement jodhpuri3;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[5]")
	WebElement jodhpuri5;
	@FindBy(xpath="//*[@class=\"list-inline mb-0\"]/li[4]")
	WebElement linkkurtapajmas;
	@FindBy(xpath="(//*[@id=\"Layer_1\"])[2]")
	WebElement kurta2;
	public void clickjodhpuri() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(linkjodhpuris));
	linkjodhpuris.click();}
	
	public void selectjodhpuri3() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(jodhpuri3));
		jodhpuri3.click();
	}
	public void selectjodhpiri5() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(jodhpuri5));
	jodhpuri5.click();}
	
	public void clickkurtapajamas() {  
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(linkkurtapajmas));
	linkkurtapajmas.click();}
	public void selectkurta() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(kurta2));
		kurta2.click(); 
	}
	
	public void sort_by_option() {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(drpdwnsortby));
		Select s=new Select(drpdwnsortby);
		s.selectByVisibleText("Price Low to High"); 
		
	}
	public void selectsuit() {
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(suit5));
		suit5.click();
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
		add_suit2_to_cart.click();}

//FILTER OPTIONS CHECKING
	@FindBy(xpath="//*[@id=\"headingTwo\"]")
	WebElement fltrclr;
	@FindBy(xpath="(//ul[@id=\"colorFilter\"]//li//input)[3]")
	WebElement clrgrey;
	@FindBy(xpath="//*[@id=\"color_18\"]")
	WebElement clrblack;
	@FindBy(xpath="//*[@id=\"carouselProduct5\"]")
	WebElement product_4;
	@FindBy(xpath="//*[@class=\"d-inline size-options\"]//span[1]")
	WebElement smallsize_4;
	@FindBy(xpath="//*[@class=\"addtobag_btn content_center_flex me-2\"]")
	WebElement addtocart4;
	@FindBy(xpath="//*[@id=\"color_17\"]")
	WebElement clrwhite;
	@FindBy(xpath="//*[@id=\"carouselProduct6\"]")
	WebElement product_6;
	@FindBy(xpath="//*[@class=\"d-inline size-options\"]//span[2]")
	WebElement mediumsize_6;
	@FindBy(xpath="//*[@class=\"addtobag_btn content_center_flex me-2\"]")
	WebElement addtocart6;
	@FindBy(xpath="//*[@id=\"headingThree\"]")
	WebElement fltrsize;
	@FindBy(xpath="//*[@id=\"sizeFilter\"]//li[5]//input")
	WebElement sizexl;
	@FindBy(xpath="//h2[@id=\"headingMaterials\"]//button")
	WebElement fltrfabric;
	@FindBy(xpath="//*[@id=\"material_9\"]")
	WebElement terryrayon;
	@FindBy(xpath="//*[@id=\"carouselProduct10\"]")
	WebElement slct_pro_10;
	@FindBy(xpath="//*[@data-sizename=\"XL/42\"]")
	WebElement pro_10_size_xl;
	@FindBy(xpath="//*[@class=\"addtobag_btn content_center_flex me-2\"]")
	WebElement buy_now_10;
	
	public void fltr_color() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));	
		wait.until(ExpectedConditions.visibilityOf(fltrclr));
		fltrclr.click();
		}
	public void click_grey() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(clrgrey));
		clrgrey.click();
	}
	public void click_black() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(clrblack));
		clrblack.click();
	}
	public void select_product_4() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(product_4));
		product_4.click();
	}
	public void click_product_4_small() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(smallsize_4));
		smallsize_4.click(); 
	}
	public void click_addtocart_4() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(addtocart4));
		addtocart4.click(); 
	}
	public void click_white() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(clrwhite));
		clrwhite.click();
	}
	public void select_product6() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(product_6));
		product_6.click();
	}
	public void click_product_6_medium() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(mediumsize_6));
		mediumsize_6.click();
	}
	public void click_add_to_cart_6() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(addtocart6));
		addtocart6.click(); 
	}
	public void fltr_size() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(fltrsize));
		fltrsize.click(); 
	} 
	public void click_size_xl() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(sizexl));
		sizexl.click(); 
	} 
	public void click_fabric() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(fltrfabric));
		fltrfabric.click(); 
	}
	public void slct_terryrayon() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(terryrayon));
		terryrayon.click(); 
	}
	public void slct_product_10() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(slct_pro_10));
		slct_pro_10.click(); 
	}
	public void pro_10_size_xl() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(pro_10_size_xl));
		pro_10_size_xl.click(); 
	}
	public void pro_10_buynow() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(buy_now_10));
		buy_now_10.click();
	}
	
	
	
	
	
	
//NEGATIVE TESTING
//1.Increasing the quantity of the product
@FindBy(xpath="//*[@id=\"carouselProduct13\"]")
WebElement suit2;
@FindBy(xpath="//*[@data-sizeid=\"4\"]")
WebElement suitsizelarge;
@FindBy(xpath="//*[@class=\"qty-plus\"]")
WebElement suitquantity;
@FindBy(xpath="//*[@class=\"qty-minus\"]")
WebElement suitquantityless;  
@FindBy(xpath="//*[contains(@class,\"addtobag_btn\")]")
WebElement addtocart;
@FindBy(xpath="//*[@class=\"qty\"]")
WebElement qtyvalue;
public void slct_suit2() {
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(suit2));
	suit2.click();
}
	public void suit_size_large() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(suitsizelarge));
		suitsizelarge.click();
	}
	public void suitquant_more() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(suitsizelarge));
		suitquantity.click();
	}
	public void suitquant_less() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(suitquantityless));
		suitquantityless.click();
	}
	public void move_to_cart() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(suitsizelarge));
		addtocart.click();
		}
	public String qty_of_suit() {
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(qtyvalue));
		String value=qtyvalue.getAttribute("value");
		System.out.println("quantity of the product in cart: "+value);
		return value;
	}
	
	
	

}
