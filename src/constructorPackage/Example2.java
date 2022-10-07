package constructorPackage;

public class Example2 
{
    boolean a;
    
    Example2(boolean z )
    {
    	a=z;
    }
	public void test()
	{
		
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		Example2 obj = new Example2(5<13);	
		obj.test();
	}
		
}
