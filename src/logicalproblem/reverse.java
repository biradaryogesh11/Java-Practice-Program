package logicalproblem;

public class reverse 
{
	public static void main(String args[])
	{
	     String s="yogesh";
	     int l=s.length();
	     String add=" ";
	    for(int i=l-1;i>=0;i--)
	{
	      char ch= s.charAt(i);
	            add= add+ch;
	}
	   System.out.println(add);
	}
}
