package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.testNgListeners.class)
public class TestNGListenerDemo2 {
@Test
public void test4() {
	System.out.println("Test1");
}
@Test
public void test5() {
	System.out.println("Test2");
	//assert.assertTrue(false);
	
}
@Test
public void test6() {
	System.out.println("Test1");
}
}
