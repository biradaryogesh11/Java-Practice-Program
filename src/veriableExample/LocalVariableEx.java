package veriableExample;

public class LocalVariableEx 
{
	public static void test()
	{
		int a= 240 ;
		int b= 8747;
	System.out.println(a+b);
	}
	
    public void test2()
    {
    	boolean ab= 97< 100;
    	float ac= 34445.4476f;
    	System.out.println(ab);
    	System.out.println(ac);
    }
    public static void main(String args[])
    {        
        test();
        LocalVariableEx obj = new LocalVariableEx();
        obj.test2();
    	
    }
    
    
}
