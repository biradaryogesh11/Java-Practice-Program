package operatorPackage;

public class ShiftOperator {
 
	public static void main(String args[])  
	{  // Shift left operator
		System.out.println(10<<2);// 10*2^2=10*4=40
		System.out.println(20<<4);// 20*2^4=20*16=320
		System.out.println(25<<5);// 25*2^5=25*32=800
		
		// Shift Right operator
		System.out.println(10>>2);// 10/2^2=2
		System.out.println(20>>4);//  20/2^4=1
		System.out.println(25>>5);//  25/2^5=0
		
	}
	
	
}
