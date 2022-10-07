package logicalproblem;

public class PalindromeNumber
{

	   public static void main(String args [])
	  {
	      int num= 54745;
	      int mod;
	     int rev=0;
         int org=num;
	    while(num>0)
	{
	              mod =num%10;
	               rev = rev*10+mod;
	              num= num/10;

	}
	 
	 System.out.println(org + " this is actual number");

	    System.out.println(" ");
	    
	    if(org==rev)
	    {
	    	System.out.println(rev+" This is palindrome number");
	    }
	    else
	    {
	    	System.out.println(" This is not palindrome number");
	    }
	}


	}


