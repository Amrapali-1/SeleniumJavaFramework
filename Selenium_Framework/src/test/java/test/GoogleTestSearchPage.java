package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleTestSearchPage {
private static WebDriver driver=null;
	
		public static void main(String[] args) {
			googleSearch();

		}
		public static void googleSearch() {
			String ProjectPath= System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.name("q")).sendKeys("Automation");
			GoogleSearchPage.textBox_Search(driver).sendKeys("Automation");
			
			//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
			GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
			driver.close();
			System.out.println("test is completed");
		}


}
