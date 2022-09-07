package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	 WebDriver driver=null;
	//public static  String browserName=null;
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		//PropertiesFile.getProperties();
		//if (browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
		//}
		/*else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",projectPath+"\\Drivers\\geckodriver.exe");
				 driver=new FirefoxDriver();
		}*/
		}
	
		
		
	
	@Test

	public  void googleSearch() {

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//driver.findElement(By.className("gNO89b")).click();
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
		
		System.out.println("Test completed successfully");
		//PropertiesFile.setProperties();
	}
	}



		

