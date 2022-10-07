package scannerPackage;

import java.util.Scanner;

public class BooleanCondition 
{
	
	
   public static void mainn(String args[])
   {    
	    
	   Scanner abc= new Scanner(System.in);
	   
		System.out.print("Enter your 1st condition: ");
		
		int b1= abc.nextInt();
		
		System.out.print("Enter your 2nd Condition: ");
		
		int b2= abc.nextInt();
		
		System.out.println("Enter your 3rd Condition: ");
		
     	boolean c=abc.nextBoolean();
     	
	     if(c==true)
	     {  int sum=b1+b2;
	    	 System.out.println(sum);
	     }
	     else
	     { int  sub=b1-b2;
	    	 System.out.println(sub); 
	     }
	     
	   
	   
   }
}
