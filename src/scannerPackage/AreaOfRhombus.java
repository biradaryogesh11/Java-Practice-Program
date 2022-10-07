package scannerPackage;

import java.util.Scanner;

public class AreaOfRhombus 
{
	public static void main(String args[])
	{
//	Area Of Rhombus= d1*d2/2
    

	Scanner obj=new Scanner (System.in);
    System.out.print("Enter the Value: ");
	int d1=obj.nextInt();
	System.out.print("Enter the Value: ");
	int d2=obj.nextInt();
	int c= d1*d2/2;
	System.out.println(c);
	
	obj.close();
	}
}
