package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String ProjectPath= System.getProperty("user.dir");
System.out.println(ProjectPath);
System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://google.com/");
WebElement textBox=driver.findElement(By.name("q"));
textBox.sendKeys("Automation");
Thread.sleep(3000);
driver.close();
	
	}
	
	


}