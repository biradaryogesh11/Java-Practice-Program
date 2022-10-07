package logicalproblem;

public class Reverse1 
{
	  public static void main(String args[])
	  {
	       int a= 123456;
	            int n=6;
	           int rev=0; 
	     for(int i=n;i>=1;i--)
	  {
	        int mod= a%10;
	          rev= rev*10+mod;
	           a= a/10;
	  }
	    System.out.println(rev);
	  }
	
}
