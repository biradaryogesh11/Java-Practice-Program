package logicalproblem;

public class ReverseNumber
{
	// WAP for Reverse Number
	public static void main(String args[])
	{   
		int num= 23145;
		int mod;
		int rev=0;
		int org=num; 
		while (num>0)
		{
			mod=num%10;
			rev=rev*10+mod;
			num=num/10;
		}
		System.out.println("The orignal number is: "+org);
		System.out.println(" ");
		System.out.println("The Reverse number is: "+rev);
			
		
	}

}
