package polymorphism;

public class FinalOverloded 
{

	public  void test(int b)
	{
		System.out.println("int method");
	}
	public  void test2(float f)
	{
		System.out.println("float method");
	}
	public static void main(String args[])
	{
		FinalOverloded B=new FinalOverloded ();
		B.test(14);
		B.test2(10.5f);
		
	}
}
