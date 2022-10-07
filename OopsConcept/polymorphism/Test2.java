package polymorphism;

public class Test2 extends Test1

// Can we override the orverloaded methods?

{
	Test2(int b)
	{
		super(b);
		// TODO Auto-generated constructor stub
	}
	@Override
	 public  void run(int a)
	   {
		   System.out.println("this is int from run method from test 2");
	   }
	@Override
	   public void run(String b)
	   {
		   System.out.println("this is String from run2 method from test 2");  
	   }
 
	public static void main(String args[])
	{
		Test2 B= new Test2(10);
		B.run(10);
		B.run("hello");
		
	}
}
