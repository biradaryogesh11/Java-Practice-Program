package logicalproblem;

public class FactorialNumber 

// WAP for Factourial Number 5!= 5*4*3*2*1=120

{
     public static void main(String args[])
     {    
    	 int n=5;
    	 int i;
    	 int add=1;
    	 for(i=n;i>=1;i--)
    	 {
    		 add=add*i ;
    		 
    		 
    	 }
    	
    	 System.out.println("factorial of "+n+": "+add);
     }
}
