package loopStatementPackage;

public class LoopStatement14 {
//	
//	      *  *  *  *  *
//	       *  *  *  *
//	        *  *  *
//	         *  *
//	          *
//	         *  *
//          *  *  *  
//        *  *  *  *
//       *  *  *  *  * 
        
        public static void main(String args[])
        {
        	for(int i=1;i<=5;i++)
        	{
        		for (int j=2;j<=i;j++)
        		{
        			System.out.print(" ");
        		}
        		for(int k=5;k>=i;k--)
        		{
        			System.out.print("* ");
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
        			System.out.print("* ");
        		}
        		System.out.println();
        	}
        	
        }
        
        
}