package logicalproblem;

public class ReverseString 
{
	
// WAP for Reverse String

	public static void main(String args[])
	{
		String name= "dad";
		int l=name.length();
		String add=" ";
		for(int i=l-1;i>=0;i--)
		{
			 char ch=name.charAt(i);
			  add=add+ch;
	    }
		 System.out.println(add);
		
	}
}
