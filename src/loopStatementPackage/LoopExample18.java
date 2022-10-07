package loopStatementPackage;

public class LoopExample18 {
//	
//	      *  *  *  *  *                             1  2  3  4  5      
//	         *        *                             2     -  - 
//	            *     *                             3        -
//	               *  *                             4
//	                  *                             5
//	
	
	
	public static void main(String args)
	{
		int k=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for( k=5;k>=i;k--)
			{
	//			if((i==2&&k==3)||(i==2&&k==4)||(i==3&&k==4))
    //				{
	//				System.out.print(" ");
	//			}
	//			else
	//			{
	//				System.out.print("*");
	//			}
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
