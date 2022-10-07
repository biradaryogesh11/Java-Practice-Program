package WhileLoopPackage;

public class ArmstrongNumber {
	
	public static void main(String args[])
	{
		int num= 371;
		int mod;
	
		int mod1;
		int arm=0 ;
		int org=num;
		
		while(num>0)
		{
			mod=num%10;
			mod1=mod*mod*mod;
			arm=arm+mod1;
			num= num/10;
			
		}
		if(org==arm)
		{
			System.out.println(" this is armstrong number"  );
		}
		else
		{
			System.out.println(" this is  not an armstrong number"  );
		}
		
		}
	

}
