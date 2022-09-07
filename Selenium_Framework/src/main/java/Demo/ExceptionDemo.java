package Demo;

public class ExceptionDemo {

	public static void main(String[] args)  {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
public static void demo() throws Exception {
	System.out.println("Hello World");
	throw  new ArithmeticException("not valid operation");
	//int i=1/0;
	//System.out.println("test is completed");
	/*try{
		System.out.println("Hello World");
		int i=1/0;
		System.out.println("test is completed");
	}catch(Exception e) {
		System.out.println("Exception is handled");
		System.out.println("e.getMessage()");
		System.out.println("e.getCause()");
		e.printStackTrace();
		
	}finally {
		System.out.println("finall block is executed irrespective of try and catch block");
	}*/
}
}
