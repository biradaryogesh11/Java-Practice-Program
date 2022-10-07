package scannerPackage; 

import java.util.Scanner;

public class Addition 
{
	public static void main(String args[])
	{
		Scanner abc = new Scanner (System.in);
		System.out.print("Enter your Number1: ");
		double d1= abc.nextDouble();
		System.out.print("Enter your number2: ");
		double d2= abc.nextDouble();
		double d3= d1+d2;
		System.out.print(d3);
		abc.close();
		
	}

}
