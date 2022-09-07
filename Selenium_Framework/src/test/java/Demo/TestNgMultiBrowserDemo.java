package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
  
public class TestNgMultiBrowserDemo {
	WebDriver driver=null;
	String projectPath=System.getProperty("user.dir");
@BeforeTest
@Parameters("Browser")
public void setUp(String Browser) {
	System.out.println("bROWSER NAME IS"+Browser);
	if(Browser.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	}else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\geckodriver.exe");
		 driver=new ChromeDriver();
		
	}
	
}
@Test
public void test() {
	driver.get("https://www.google.com/");
	
}
@AfterTest
public void tearDown() {
	driver.close();
	System.out.println("test is completed");
}
}
