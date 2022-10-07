package constructorPackage;

public class Example3 {
	
	static int a;
	static float b;
	Example3()
	{   a=20;
		b=30;	
	}
	Example3(String z)
	{
		a=50;
		b=50;
	}
	public static void test1()
	{    System.out.println(" ");
	     System.out.println(a+b);
	     System.out.println(a-b);
	     
	}
	public void test2()
	{     System.out.println(" ");
		System.out.println(a*b);
	     System.out.println(a/b);
	}
    public static void main(String args[])
    {
    	new Example3();
     	test1();
         new Example3("hi");
    	test1();
        Example3 l =new Example3();
    	l.test2();
    	 Example3 p =new Example3("hello");
    	 p.test2();
    	    
    	 
    	 
    }
   
}
