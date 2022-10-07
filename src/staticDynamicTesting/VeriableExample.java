package staticDynamicTesting;

public class VeriableExample {
	 static int a= 12*3 ;
	static int b= 128+2 ;
	
	
	public static void variableExample ()
	{
		int a= 60 ;
		int c = b-a ;
		System.out.println(c);
	}
		
	public void variableExample2 () {
		
 double d= (b/a)  ;
	System.out.println(d);
	}
	
	
	
	public static void main(String args []) 
	{
		variableExample ()	;	
		VeriableExample aaa = new VeriableExample ();
		aaa.variableExample2 ();
		
		
		
	}
	
	
	
	
	
	
}
