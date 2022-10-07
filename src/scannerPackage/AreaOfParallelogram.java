package scannerPackage;

import java.util.Scanner;

public class AreaOfParallelogram 
{ // Area of Parallelogram= b*h
	
	public static void main(String args [])
	{
		
			
			Scanner obj=new Scanner (System.in);
			System.out.print("Enter the Value: ");
			int b=obj.nextInt();
			System.out.print("Enter the Value: ");
			int h=obj.nextInt();
			double c= b*h;
			System.out.println(c);
			
			obj.close();
	}
	
	

}
