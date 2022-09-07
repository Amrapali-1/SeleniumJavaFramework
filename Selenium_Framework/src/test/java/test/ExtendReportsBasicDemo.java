package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo {
private static WebDriver driver=null;
	public static void main(String[] args) {
		
ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("extentReports.html");
ExtentReports extent=new ExtentReports();
extent.attachReporter(htmlReport);
ExtentTest test=extent.createTest("googleSearch", "Test GoogleSearch functionality");
String ProjectPath= System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
 driver = new ChromeDriver();
 test.log(Status.INFO, "Start test");
driver.get("https://www.google.com/");
test.pass("navigate to google.com");
driver.findElement(By.name("q")).sendKeys("Automation");
test.pass("ENTERED TEST IN SEARCH BOX");
driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
test.pass("preass keyboard enter key");
driver.close();
driver.quit();
test.pass("closed the browser");
test.info("test completed");
ExtentTest test2=extent.createTest("googleSearch", "Test GoogleSearch functionality");

System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
 driver = new ChromeDriver();
 test2.log(Status.INFO, "Start test");
driver.get("https://www.google.com/");
test2.pass("navigate to google.com");
driver.findElement(By.name("q")).sendKeys("Automation");
test2.pass("ENTERED TEST IN SEARCH BOX");
driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
test2.fail("preass keyboard enter key");
driver.close();
driver.quit();
test2.pass("closed the browser");
test2.info("test completed");
extent.flush();


	}

}
