package scannerPackage;

import java.util.Scanner;

public class PerimeterOfSquare 
{
  //Perimeter Of Square= addition of four side
	
	public static void main(String args [])
	{
		Scanner obj=new Scanner (System.in);
	    System.out.print("Enter the Value: ");
		int d1=obj.nextInt();
		int d2= d1+d1+d1+d1;
		System.out.print(d2);
	}
}
