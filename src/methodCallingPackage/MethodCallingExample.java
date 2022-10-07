package methodCallingPackage;

public class MethodCallingExample {
	
	
	
	public static void test1()
	{
		 System.out.println("My mobile number");
	}
   public void test2()
   {
	   System.out.println("9421366179");
   }
   public static void main(String args[])
   {
	 //  MethodCallingExample.test1();
	 //  test1();
	   MethodCallingExample aaa= new MethodCallingExample();
	   aaa.test2();
	   aaa.test1();	   
   }
}
