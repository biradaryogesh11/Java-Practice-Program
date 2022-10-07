package publicPackage1;

public class ClassB
{
	public int b=15;
	 public ClassB()
	{
		System.out.println("Constructor of ClassB");
	}
	public  void test2()
	{
		System.out.println("test2 method of ClassB");
	}
	
  public static void main(String args [])
  {
	  ClassA a2= new ClassA();
	  a2.test1();
	  System.out.println(a2.a);
	  ClassB b2= new ClassB();
	  b2.test2();
	  System.out.println(b2.b);
  }
	
}
