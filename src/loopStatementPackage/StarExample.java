package loopStatementPackage;

public class StarExample 
{
	
	public static void main(String args[])
	
	{
		for (int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=5;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println(" ");
		
		for(int i=5;i>=1;i--) 
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
		System.out.println(" ");
		
	     for(int i=1;i<=5;i++)
	     {
	    	 for(int j=1; j<=i;j++)
	    	 {
	    		 System.out.print("* "); 
	    	 }
	    	 System.out.println();
	     }
	     
	     System.out.println(" ");
	     
		for(int i=1;i<=5;i++)                       //  *  *  *  *  * 
		{                                          //   *  *  *  *  *
			                                       //   *  *  *  *  *
			for(int j=5;j>=1;j--)                  //   *  *  *  *  *
			{                                      //   *  *  *  *  *
				System.out.print("* ");            //  
			}
			System.out.println();
			}
		
		System.out.println(" ");
		
		for(int i=0;i<=5;i++)                       //   
		{                                          //   
			                                       //   
			for(int j=1;j<=5-i;j++)                  //   
			{   
				for (int h=1; h<=5;h++) 
				{
				System.out.print("* ");   
			 }  
			}
			System.out.println();
			}
	}
}
