package Demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test(priority=2)
	public void one() {
		System.out.println("test1");
	}
	@Test(priority=1)
public void two() {
		System.out.println("test2");
	}
	@Test
public void three() {
		System.out.println("test3");
}
}
