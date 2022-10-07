package loopStatementPackage;

public class LoopExample20 
{//
//	                                  1 2 3 4 5           4 3 2 1      
//	        * * * * * * * * *         * * * * *  1        * * * * 1    
//	          *           *           - *        2            *   2
//	            *       *             - - *      3          *     3
//	              *   *               - - - *    4        *       4
//	                *                 - - - -  * 5 
//	

	public static void main(String args [])
	{
		int n=5 ;
		int i;
		int k;
		int l;
       for ( i=1;i<=n;i++)
       {
    	   for(int j=2;j<=i;j++)
    	   {
    		   System.out.print(" ");
    	   }
    		   for(k=5;k>=i;k--)
    		   {
    			   if(i==1||k==5)
    			   {
    				   System.out.print("*");
    			   }
    			   else
    			   {
    				   System.out.print(" ");
    			   }
    			}
    		   for(l=4;l>=i;l--)
    		   {
    			  if(i==l||i==1)
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
