package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.testNgListeners.class)

public class TestNGListenerDemo {
@Test
public void test1() {
	System.out.println("Test1");
}
@Test
public void test2() {
	System.out.println("Test2");
	String ProjectPath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com/");
	driver.findElement(By.name("q")).sendKeys("Automation");
	driver.findElement(By.name("abc")).sendKeys("A B C D");
	driver.close();
	System.out.println("test is completed");
}
@Test
public void test3() {
	System.out.println("Test1");
}
}
