package constructorPackage;

public class Example1 {
	
	String b;
	int c;
	
	Example1()
	{
		b="Address: ";
		c= 122;
		System.out.println(b+"atpost-hanchnal,ta-deoni,"+"House no: "+c);
    }
	Example1(String z)
	{
		b= "District Name: ";
		c= 413512;
		System.out.println(b+"Latur,"+"pincode: "+c);
	}
	Example1(int y)
	{
		b= "House Name: ";
		c= 1990;
		System.out.println(b+"Swara,"+"Established Year: "+c);
	}
	public void test1()
	{
		// System.out.println(" ");
		System.out.println();
	}
   public static void main(String args[])
   {
	   Example1 aaa= new Example1();
	   aaa.test1();
	   Example1 aaa1= new Example1("hi");
	   aaa1.test1();
	   Example1 aaa2= new Example1(12);
	   aaa2.test1();
   }
}
