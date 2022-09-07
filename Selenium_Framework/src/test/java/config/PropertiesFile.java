package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNGDemo;

public class PropertiesFile {
	 static Properties prop= new Properties();
static String projectPath=System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
public static void getProperties()  {
	
	try {
		
InputStream file=new FileInputStream(projectPath+"\\src\\test\\java\\Config\\config.properties");
		prop.load(file);
		String  browser=prop.getProperty("Browser");
		System.out.println(browser);
	//TestNGDemo.browserName 	=browser; 	 	 	 	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.getMessage();
		e.getCause();
		e.printStackTrace();
	}
}
	public static void setProperties()  {
		
		try {
			
			OutputStream file=new FileOutputStream(projectPath+"\\java\\Config\\config.properties");
			prop.setProperty("result","Pass");
			prop.store(file,null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
}




}
