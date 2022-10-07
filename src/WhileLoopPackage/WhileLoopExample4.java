package WhileLoopPackage;

//import java.util.Scanner;

public class WhileLoopExample4 
{
//	Area Of Triangle= ab/2
	
      public static void main(String args [])
      {
//    	Scanner obj= new Scanner(System.in);
//    	System.out.print("Enter the Number: ");
//    	 int a= obj.nextInt();
//    	 System.out.print("Enter the Number: ");
//    	 int b= obj.nextInt();
//    	 System.out.print("Enter the Number: ");
//    	  int c= (a*b)/2;
//    	System.out.println(" Area of Triangle: "+c);
    	  
    	 
    	  String aaa = "yogesh";
    	 // String org = aaa;
    	  int l=aaa.length();
    	  String rev="";
    	  for(int i=l-1;i>=0;i--)
    	  {
    		  char ch= aaa.charAt(i);
    		   rev=rev+ch;
    	  }
    	  
    	  System.out.println(rev);
      }
	
}
