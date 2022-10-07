package loopStatementPackage;

public class LoopExample19 {
//	
//	               *                      
//	            *     *
//	         *           *
//	      *                 *   
//	   *  *  *  *  *  *  *  *  *         
//	
	
	public static void main(String args[])
	{
		int i=1;
		int j=1;
		int k=1;
		int l=1;
		
		
		for( i=1;i<=5;i++)
		{
			for( j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for( k=1;k<=i;k++)
			{ 
				if(i==5||k==1)
			{
					System.out.print("*");
			}
			else
			{
					System.out.print(" ");
			}
			}
			for( l=2;l<=i;l++)
			{
				if(i==l||i==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		 }
		}
	  }
