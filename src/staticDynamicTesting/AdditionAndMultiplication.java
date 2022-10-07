package staticDynamicTesting;

public class AdditionAndMultiplication {

	public static void main(String args[])
	{
		
		System.out.println("Addition And Multiplication");
		test1();
		AdditionAndMultiplication x = new AdditionAndMultiplication ();
         x.test2();		
	}
	public static void test1()
	{
		
		System.out.println(10+70);
		System.out.println(62-57);
		System.out.println(59+167);
		System.out.println(70/35);	
	}
	
	public void test2 ()
	{
	System.out.println(30*15);			
	System.out.println(27*27);	
		
	}

	
	
}
