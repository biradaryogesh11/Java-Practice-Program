package veriableExample;

public class StaticVeriableEx 
     {
	
        static	int a= 242364;
        static int b= 21436412 ;
        static float g = 4535.35356f ;
         static double r = 733676.4545 ;
     
     public static void test()  
     {
         int aa =a+b ;
    	 double bb = a/b ;
    	 System.out.println(aa);
    	 System.out.println(bb);
    	 }
	public void test1() 
	 {
	    double dd = g/r ;
		double ff = g*r ;
		System.out.println(dd);
		System.out.println(ff);
		}
	
	
	public static void main(String args[]) 
	{
		 test();
		 StaticVeriableEx obj =new StaticVeriableEx();
		 obj.test1(); 
	}

}
