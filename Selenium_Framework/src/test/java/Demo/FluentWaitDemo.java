package Demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class FluentWaitDemo {
	public static void main(String[] args) {
		Test();
	}
public  static void Test() {
	String projectPath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",projectPath+"\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys(" ABCD");
	//driver.findElement(By.className("gNO89b")).click();
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
		//	.withTimeout(30,TimeUnit.SECONDS)
			//.pollingEvery(5,TimeUnit.SECONDS)
			.ignoring(NoSuchElementException.class);
	driver.findElement(By.linkText("ABCD: American-Born Confused Desi - Wikipedia")).click();
	
	driver.close();
	driver.quit();
	
	
}
}
