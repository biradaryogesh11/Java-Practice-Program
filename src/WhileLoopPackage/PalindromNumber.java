 package WhileLoopPackage;

public class PalindromNumber 
{   
	public static void main(String args[])
	{ 
		//
	int	num =74637;
	int org=num;
	int mod;
	int rev=0;
	while(num>0)
	{
		mod=num%10;
		rev= rev*10+mod;
		num=num/10;
	}
	
	
	if(org==rev)
	{
		System.out.println("This is palindrom number");
	}
	else
	{
		System.out.println("This is not a palindrom number");
	}
		
	}
}
