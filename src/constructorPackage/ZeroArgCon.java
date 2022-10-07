package constructorPackage;

public class ZeroArgCon
   {
	  float a;
	  
	ZeroArgCon()
	{
		a= 20.5f;
		System.out.println(a);
	}
	ZeroArgCon(double b)
	{
		a=19.5f;
		System.out.println(a);
	}
//    public void test() 
//    {
//    	
//    	
//    }
	
	public static void main(String args[])
	{
		ZeroArgCon obj= new ZeroArgCon();
		ZeroArgCon obj1= new ZeroArgCon(10.10);
	//	obj.test();
	//'	obj1.test();
		
	}
	
	
	
	
        
   }
