package constructorPackage;

public class ArgConExample2
{
	int aa;
	int bb;
	ArgConExample2()
	{
		aa=20;
		bb=30;
	}
	ArgConExample2(int a)
	{
		aa=5;
		bb=10;
	}
	ArgConExample2(char c)
	{
		aa=50;
		bb=50;
	}
	public void test()
	{
		System.out.println(aa*bb);
		System.out.println(aa-bb);
		System.out.println(aa+bb);
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		ArgConExample2 obj = new ArgConExample2();
		ArgConExample2 obj1 = new ArgConExample2(11);
		ArgConExample2 obj2 = new ArgConExample2('i');
		obj.test();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		obj1.test();
		obj2.test();
	}
}
