package operatorPackage;

public class LogicalOperator {
	
	public static void main(String args[])
	{    //And logical
		System.out.println("");
		System.out.println((75<25)&&(45>55));// f f =F
		System.out.println((60>50)&& (60<80));//T T =T
		
		// Or logical
		System.out.println("");
		System.out.println((56>70)|| (54>45));//f T =T
		System.out.println((56<45)|| (100>200));//f f=f
		// Nor logical
										
		
		System.out.println("");	
		System.out.println(!((75<25)&&(45>55)));//T
		System.out.println(!((56>70)|| (54>45)));//F
	}

}
