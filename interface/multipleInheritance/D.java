package multipleInheritance;

public class D implements A,B,C
{

	@Override
	public void test3() 
	{
		System.out.println("test3 from C");
		
	}

	@Override
	public void test2() 
	{
		System.out.println("test2 from B");
		
	}

	@Override
	public void test1() 
	{
		System.out.println("test1 from A");
		
	}
	public static void main(String args[])
	{
		D d= new D();
		d.test1();
		d.test2();
		d.test3();
	}

}
