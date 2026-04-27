package testBase;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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
	
	
	

	
	
	
	
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
	 
	
	
	

}
