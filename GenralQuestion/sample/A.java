package sample;

public class A 
{
	public class B
	{
		public void m1()
		{
		System.out.println("hi Yogesh");
		}
	}
	public class C extends B
	{
		public void m2()
		{
		System.out.println("hello Everyone");
		}
		
	}
	public static void main(String args[])
	{
		A obj=  new A();
		A.C obj1= obj.new C();
		obj1.m1();
		obj1.m2();
	}
   
}
