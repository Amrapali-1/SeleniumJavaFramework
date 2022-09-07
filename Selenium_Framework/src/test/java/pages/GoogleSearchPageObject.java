package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	WebDriver driver =null;
By textBox_Search=By.name("q");
By Button_Search=By.name("btnK");
public GoogleSearchPageObject(WebDriver driver){
	this.driver=driver;
	
}
public void setTextInSearchBox(String text) {
	driver.findElement(textBox_Search).sendKeys(text);
	
}
public void clickOnSearchButton() {
	driver.findElement(Button_Search).sendKeys(Keys.RETURN);
	}

	
	}


