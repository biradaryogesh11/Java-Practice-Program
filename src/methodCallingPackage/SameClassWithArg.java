package methodCallingPackage;

public class SameClassWithArg {
	
	
	public static void test1(String b) 
	{
		System.out.println("My college name is: "+b);
	}
    public void test2(int c)
    {
    	System.out.println("Pincode: "+c);
    }
    public static void main(String args[])
    {
    	//SameClassWithArg.test1("jspm");
    	SameClassWithArg aaa= new SameClassWithArg();
    	aaa.test1("jspm");
    	aaa.test2(411041);
    }
    
}
