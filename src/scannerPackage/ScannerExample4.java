package scannerPackage;

import java.util.Scanner;

public class ScannerExample4 
{
public static void main(String args[])
{
	   Scanner abc= new Scanner(System.in);
	   System.out.print("Enter your 1st number1: ");
	   double b1= abc.nextByte();
	   System.out.print("Enter your 1st Number2: ");
	   double b2=abc.nextByte();
	   double b3= b1-b2;
	   System.out.println(b3); 
}

}
