package scannerPackage;

import java.util.Scanner;

public class AreaOfIsoscelusTriangle 
{
//	Area Of Isosceles Triangle= bh/2
public static void main(String args[])
{
	
	Scanner obj=new Scanner (System.in);
	System.out.print("Enter the Value: ");
	int a=obj.nextInt();
	System.out.print("Enter the Value: ");
	int b=obj.nextInt();
	double c= (a*b/2)*(Math.sin(0.7853));
	
	System.out.println(c);
obj.close();	
}
}
