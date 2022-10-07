package polymorphism;

public class Test1 
{
    Test1(int b)
    {
    	System.out.println("this is int from constructer method");
    }



   public  void run(int a)
   {
	   System.out.println("this is int from run method");
   }
   public void run(String b)
   {
	   System.out.println("this is String from run2 method");  
   }
}
