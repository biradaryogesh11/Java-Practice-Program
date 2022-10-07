package operatorPackage;

public class ArgunentOperator {
	
	public static void main(String args[])
	{
		int a= 25;
		System.out.println(a+=25); // a= (25+25)=50
		
		System.out.println(a-=10); // a= (50-10)=40
		
		System.out.println(a*=30); // a= 40*30=1200
		
		System.out.println(a/=50); // a= 1200/50=24
		
		System.out.println(a%=20); // a= 24/20= 4
		
		System.out.println(a&=30);  // a= 1 1 1 1 0             30= 32 16 8 4 2 1
		                           //     0 0 1 0 0               =    1 1 1 1 0
		                           // &   0 0 1 0 0 = 4
		
		System.out.println(a|=18);   // a= 1 0 0 1 0            18= 32 16 8 4 2 1
		                             //    0 0 1 0 0                    1 0 0 1 0
		                             //(|) 1 0 1 1 0=22
		
		System.out.println(a^= 10);  // a= 0 1 0 1 0         a(10) = 16 8 4 2 1
		                             //    1 0 1 1 0                    1 0 1 0        
		                             // (^)1 1 1 0 0=28      a(22) =  32 16 8 4 2 1 
		                             //                                   1 0 1 1 0
		// 
		System.out.println(a<<=4);  // a= 28*2^4=448
		
		System.out.println(a>>=7);  // a= 448/2^7=3
		
	}
}
