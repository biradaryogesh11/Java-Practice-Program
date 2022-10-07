package methodCallingPackage;

public class MethodCallingExample2 {

	public static void test3()
	{
	System.out.println("My village Name");
	}
	public void test4 ()
	{
		System.out.println("hanchnal");
	}
	public static void main(String args[])
	{
		MethodCallingExample.test1();
		MethodCallingExample abc = new MethodCallingExample();
		abc.test2();
		MethodCallingExample2.test3();
		MethodCallingExample2 aaa = new MethodCallingExample2();
		aaa.test4();
	}
}
