package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement element=null;
	public static WebElement textBox_Search(WebDriver driver) {
		 element=driver.findElement(By.name("q"));
		return element;
	}
	public static WebElement popUp_Search(WebDriver driver) {
		 element=driver.findElement(By.cssSelector("[aria-label=\"No thanks\"]"));
		return element;
	}
	public static WebElement button_Search(WebDriver driver) {
 element=driver.findElement(By.name("btnK"));
		return element;
	}
	
}
