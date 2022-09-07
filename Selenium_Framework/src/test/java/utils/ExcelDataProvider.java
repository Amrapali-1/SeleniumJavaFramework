package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
	
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	
	@Test(dataProvider="test1Data")
	public void test1(String UserName,String Password) throws InterruptedException {
		System.out.println(UserName+"|"+Password);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");
		Thread.sleep(3000);
		
	}
	@DataProvider(name="test1Data")
public Object[][] getData(){
String excelPath="C:\\Workspace\\Selenium_Framework\\Excel\\Data.xlsx";
	
	Object data[][] = testData(excelPath,"Sheet1") ;
	return  data;
}



		// TODO Auto-generated method stub
public  Object[][] testData(String excelPath,String sheetName) {
	ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
	int rowCount =excel.getRowCount();
	int columnCount =excel.getColumnCount();
	Object data[][]=new Object[rowCount-1][columnCount];
	for(int i=1;i<rowCount;i++) {
		for(int j=0;j<columnCount;j++) {
			String cellData=excel.getCellDataString(i, j);
			//System.out.println(cellData+" |");
			data[i-1][j]=cellData;
			
		}
		//System.out.println();
	}return data;
}
}
	


