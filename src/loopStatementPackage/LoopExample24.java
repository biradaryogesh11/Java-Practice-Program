package loopStatementPackage;

public class LoopExample24
{//      
//	             * * * * *
//              *       * 
//             *       *
//            *       *
//           * * * * * 
//           
//        
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=1;k--)
			{
				if(k==5||k==1||i==1||i==5)
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
