package loopStatementPackage;

public class LoopExample17 {
//	
//	    *  *  *  *  *            1  4  3  2  1
//	    *        *               2        2
//	    *     *                  3     3
//	    *  *                     4  4
//	    *                        5
//	
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if((i==2&&j==4)||(i==2&&j==3)||(i==3)&&(j==4))
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
