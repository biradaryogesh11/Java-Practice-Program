package scannerPackage;

import java.util.Scanner;

public class AdditionOfNNumber 
{
   public static void main(String args[])
   {
	   int add=0;
	   int n=5;
	  for(int i=1;i<=n;i++)
	  {
	   Scanner ch= new Scanner(System.in);
	   System.out.print("Enter the Number: ");
	   int a= ch.nextInt();
	    add= add+a;
	   
	   
	  } 
	   System.out.println(add);
	   
	   
	   
   }
   


}
