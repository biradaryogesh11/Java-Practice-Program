package operatorPackage;

public class BitwiseOperator {
  
	public static void main(String args[])
	{    // Bitwise Operator
		System.out.println("");
		System.out.println((75<25)&(45>55));// f f =F
		System.out.println((60>50)& (60<80));//T T =T
		// Bitwise Or logical
		System.out.println("");
		System.out.println((56>70)| (54>45));//f T =T
		System.out.println((56<45)| (100>200));//f f=f
		
		// Xor Operator 
		System.out.println("");
		System.out.println((10>20)^(30<40)^(85<=85));// F T T = F F=F
		System.out.println((50<95)^(75<89)^(25<30)); // T T T =T F= T
	}
}
