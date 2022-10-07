package WhileLoopPackage;

public class ReverseNumber 
{
//	 WAP a program for reverse number
	 
	public static void main(String args[])
	{    
		int num= 356216;
		int mod;
		int rev=0;
		      while(num>0)
			{
		    	  mod=num%10;
		    	  rev=rev*10+mod;
		    	  num=num/10;
		   }
		 System.out.println(rev);
		
	}
	

}
