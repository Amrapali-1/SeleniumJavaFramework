package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class GoogleSearchPgaeTest {
	private static WebDriver driver=null;
	
public static void main(String[] args) {
	googleSearchTest();
}
public static void googleSearchTest() {
	String ProjectPath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 GoogleSearchPageObject obj=new GoogleSearchPageObject(driver);
	 driver.get("https://www.google.com/");
	 obj.setTextInSearchBox("A B C D");
	 obj.clickOnSearchButton();
	 driver.close();
}
}
