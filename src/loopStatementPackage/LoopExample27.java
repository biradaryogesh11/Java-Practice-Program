package loopStatementPackage;

public class LoopExample27 
{ 
//	
//	
//	            * * * * * * * * * *
//	            * * * *     * * * *
//	            * * *         * * *
//	            * *             * *
//	            *                 *
//	            * *             * *
//	            * * *         * * *
//	            * * * *     * * * *
//	            * * * * * * * * * *
//
	public static void main(String args[])
	{
		for (int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
				
			{
			 System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(" ");
			}
			for(int m=5;m>=i;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
	{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int l=3;l>=i;l--)
			{
				System.out.print(" ");
			}
			for(int m=0;m<=i;m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
