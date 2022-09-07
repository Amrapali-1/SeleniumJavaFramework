package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	 private static  Logger logger = LogManager.getLogger(Log4jDemo.class); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("\n  Hello World....    \n");
logger.trace("This is trace message");
logger.info("its an information");
logger.error("this is an error message");
logger.warn("this is an warning message");
logger.fatal("this is an fatal message");
System.out.println("\n  completed    \n");
	}

}
