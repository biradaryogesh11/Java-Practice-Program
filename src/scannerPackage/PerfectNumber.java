package scannerPackage;

public class PerfectNumber 
{
   public static void main(String args[])
   {
	   int n=6;
	   int i;
	   double mod;
	   int add=0;
	   for(i=n-1;i>=1;i--)
	   {
		    mod=n%i;
		    
		    
		   
		    if(mod==0)
		    {
		    	add=add+i;
		    	
		    }
		    
	   }
	    if(add==n)
	    {
	    	System.out.println("this is perfect number: "+n);
	    }
	    else
	    {
	    	System.out.println("this is not perfect number: "+n);
	    }
		    
	   
		    
	   
   }
}
