package loopStatementPackage;

public class loopExample16 
{
//
//	              *                    5  4  3  2  1
//	           *  *                    5  4  3	2  2	
//	        *     *                    5  4  3     3
//	     *        *                    5  4        4 
//	  *  *  *  *  *                    5  4  3  2  5
//	
	
	public static void main(String args[])
	{
		int i=1;
		int k=1;
		for( i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for( k=1;k<=i;k++)
			{
				if((i==3)&&(k==2)||(i==4&&k==2)||(i==4&&k==3))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
	}
}
