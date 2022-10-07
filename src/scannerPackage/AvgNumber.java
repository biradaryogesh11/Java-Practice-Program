package scannerPackage;

import java.util.Scanner;

public class AvgNumber
{
	// Find out the avg Number
	public static void main(String args[])
	{    int n=5;
	     int sum=0;
		int i=n;
		for( i=1;i<=n;i++)
		{
		
		Scanner name= new Scanner(System.in);
		System.out.print("Enter the value");
		int a=name.nextInt();
		sum=sum+a;
		
		}
		   
		System.out.println("The averag of these number"+sum/n);
		
	      

		}
	
}
