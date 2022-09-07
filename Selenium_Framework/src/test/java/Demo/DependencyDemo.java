package Demo;

import org.testng.annotations.Test;

public class DependencyDemo {
	@Test(dependsOnGroups= {"sanity.*"})
public void test1() {
	System.out.println("Test1");
	
}
	@Test(groups= {"sanity"})
	public void test2() {
		System.out.println("Test2");
}
	@Test(groups= {"sanity2"})
	public void test3() {
		System.out.println("Test3");
}
}
