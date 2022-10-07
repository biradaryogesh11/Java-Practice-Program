package logicalproblem;

public class PalindromeString 
{

	public static void main(String args [])
	{
		
		String name= "level";
	
		int l=name.length();
		System.out.println(l);
		String add="";
		String org=name;
		for(int i=l-1;i>=0;i--)
		{
			 char ch=name.charAt(i);
			  add=add+ch;
			 
			 
		}
		 System.out.println(add);
		 if(org.equals(add))
		 {
			 System.out.println("given string is palindrome string");
		 }
		 else
		 {
			 System.out.println("given string is not palindrome string");
		 }
	}
}
