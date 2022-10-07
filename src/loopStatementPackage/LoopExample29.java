package loopStatementPackage;

public class LoopExample29 
{//
//	
//                   * * * * *
//                    *     * 
//                     *   * 
//                      * *
//                       *
//                      * *
//                     *   *
//                    *     *
//                   * * * * * 
                   
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
			    System.out.print(" ");

			}
			for(int k=5;k>=i;k--)
			{
				if(k==5||i==1||k==i)
				{
				System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			 System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");	
			}
			for(int k=0;k<=i;k++)
			{
		       if(k==0||i==4||k==i)
		       {
		    	   System.out.print("* ");
		       }
		       else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
                   
}
