package logicalproblem;

public class FibNumber 
{
	   public static void main(String args [])

	   {    
	          int a=0;
	          int b= 1;
	          int sum=0;
	   System.out.println(" The fibonacci series");
	       for(int i=0;i<=5;i++)
	   {      
	        sum= a+b;
	          a=b;
	          b=sum;

	   System.out.println(sum);
	   }
	   }
}
