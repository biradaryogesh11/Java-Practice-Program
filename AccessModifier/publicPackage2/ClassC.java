package publicPackage2;

import publicPackage1.ClassA;

public class ClassC 
{
  public float f= 15.5f;
  
  public ClassC ()
  {
	  System.out.println("Constructor of ClassC");
  }
  
  public void test4()
  {
	  System.out.println("test4 Method of ClassC");  
  }
  
  public static void main(String args[])  // Cheak the import 
  {
	  ClassA a3= new ClassA();
	  a3.test1();
	  System.out.println(a3.a);
  }
	
}
