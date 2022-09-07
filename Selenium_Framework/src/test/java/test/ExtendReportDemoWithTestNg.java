package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportDemoWithTestNg {
	ExtentHtmlReporter extentHtmlReport;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		 extentHtmlReport=new ExtentHtmlReporter("extentReports.html");
		 extent=new ExtentReports();
		extent.attachReporter(extentHtmlReport);
		
		String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@BeforeSuite
	public void setUpTest() {
		
		String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test
	public void test() throws IOException {
		ExtentTest test=extent.createTest("googleSearch", "Test GoogleSearch functionality");
		test.log(Status.INFO, "This step show use of log");
		test.info("this step shows use of info(Details)");
		test.fail("details");
		//test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath(null));
		test.addScreenCaptureFromPath("screenshot.png");
	}
	public void test2() throws IOException {
		ExtentTest test=extent.createTest("googleSearch", "Test GoogleSearch functionality");
		test.log(Status.INFO, "This step show use of log");
		test.info("this step shows use of info(Details)");
		test.pass("details");
		//test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath(null));
		test.addScreenCaptureFromPath("screenshot.png");
	}

		/*String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 test.log(Status.INFO, "Start test");
		driver.get("https://www.google.com/");
		test.pass("navigate to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("ENTERED TEST IN SEARCH BOX");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("preass keyboard enter key");
	}*/
	@AfterTest
	public void tearDownTest() {
	driver.close();
	driver.quit();
	System.out.println("Test is completed");
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();

	}
}
