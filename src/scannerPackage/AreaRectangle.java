package scannerPackage;

import java.util.Scanner;

public class AreaRectangle 
{
//	Area Of Rectangle Program 
	
	public static void main(String args[])
	{    
		
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter the Value: ");
		int a=obj.nextInt();
		System.out.print("Enter the Value: ");
		int b=obj.nextInt();
	      int c=a*b;
	  	System.out.print("Area of Rectangle : "+c);
		
	  	obj.close();
	}

}
