package Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGretryFailedDemo {

	@Test
	public void Test1() {
		System.out.println("test1");
	}
	@Test
	public void Test2() {
		System.out.println("test2");
		//int i=1/0;
		
	}
	@Test(retryAnalyzer=Demo.RetryAnalyzer.class)
	public void Test3() {
		System.out.println("test3");
		Assert.assertTrue(0>1);
	}
}
