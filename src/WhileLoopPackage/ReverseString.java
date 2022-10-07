package WhileLoopPackage;

public class ReverseString 
{
      public static void main(String args[])
      {
    	  String aaa= "mangesh";
    	  int len= aaa.length();
    	  int  i;
    	  String rev=" ";
    	  for(i=len-1;i>=0;i--)
    	  {
    		  char ch=aaa.charAt(i);
    		  rev=rev+ch;;
    		  
    	  }
    	  System.out.println(rev);
      }
      
}
