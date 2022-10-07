package polymorphism;

public class MainMethodOverloading 
{
     public static void main()
     {
    	 System.out.println("Zero arg main method");
     }
	public static void main(int a)
	{
		System.out.println("int arg main method");
	}
	public static void main(String b)
	{
		System.out.println("String arg main method");
	}
	public static void main (String args [])
	{
		 MainMethodOverloading.main();
		MainMethodOverloading.main(10);
		MainMethodOverloading.main("HH");
		
	}
}
