package polymorphism;

public class StaticOverloading
{
	public static void test(int b)
	{
		System.out.println("int method");
	}
	public static  void test(String f)
	{
		System.out.println("char method");
	}
	public static void main(String args[])
	{
		
		test(14);
		test("hi");
	}
}
