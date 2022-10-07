package logicalproblem;

public class FibonacciNumber 
{
//	write a program for fibonacciNumber
	
	public static void main(String args[])
	{
		
		int c;
		 int a=0;
         int b=1;
         System.out.print("0 "+"1 ");
		for(int i=1;i<=10;i++)
		{
		 
          c=a+b;
          a=b;
          b=c;		  
      
          System.out.print(c+" ");  
	   }
	
	}
}
