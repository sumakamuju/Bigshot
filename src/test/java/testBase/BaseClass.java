package testBase;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public Properties p;
	
	
	@BeforeClass
	public void setup() throws IOException {
		

		

		        FileReader file = new FileReader("./src/test/resources/config.properties");
		        p = new Properties();
		        p.load(file);

		        String browser = p.getProperty("browser");

		        if(browser.equalsIgnoreCase("chrome")) {
		            driver = new ChromeDriver();
		        }

		        driver.manage().deleteAllCookies();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        driver.get(p.getProperty("url"));
		        
		    }
	
	public String randomString() {
		String generatedString=RandomStringUtils.secure().nextAlphabetic(10);
		return generatedString;
	}
	public String randomNumeric() {
		String generatedNumeric=RandomStringUtils.secure().nextNumeric(10);
		return generatedNumeric;
	}
	public String randomAlphaNumeric() {
		String generatedString=RandomStringUtils.secure().nextAlphabetic(6); 
		String generatedNumeric=RandomStringUtils.secure().nextNumeric(6);
		return(generatedString+generatedNumeric);
		
	}
	
	

	
	
	
	
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
	 
	
	
	

}
