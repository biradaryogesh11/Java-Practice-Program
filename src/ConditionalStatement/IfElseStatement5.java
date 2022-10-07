package ConditionalStatement;

public class IfElseStatement5 {
	
	
	public static void main(String args[])
	{
		// wap input number which one is larger
		
		int a= 34;
		int c= 45;
		int d= 102;
		
		if((d>c)&&(d>a))
		{
			System.out.println("this is the larget in between them");
		}
		 if ((c>a)&&(c<d) )
		{
			System.out.println("this number is in betwwen small and big number");
		}
		else
		{
			System.out.println("this is the smallest number");
		}
			
	}

}
