package finalKeyword;

public  class ClassB          // Declation is "possible" using "final" keyword for class
{

	final int a= 20;             // Declation is " possible" using "final" keyword for Variable
	
	 ClassB()                     // Declation is "not" possible using "final" keyword for Constructor
	{
		 System.out.println("dsfy");	
	}
	 public final void aaa()           // final keyword wont let you change the vaiable value
	 {
		    
		 System.out.println(a);
	 }
	 
	 public static void main(String args[])
	 {
		 ClassB b= new ClassB();
		 b.aaa();
		 System.out.println(b.a);
	 }
}
