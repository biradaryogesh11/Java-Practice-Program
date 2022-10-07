package methodCallingPackage;

public class Mumbai {
    
	public static void test3( String d)
	{
	   System.out.println(d);
	}
	public void test4(int f)
	{
		System.out.println(f);
	}
	public static void main(String args[])
	{
	Pune.test1("yogesh");
	Pune aaa=new Pune ();
	aaa.test2(111);
	
	}
}

