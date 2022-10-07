package scannerPackage;

public class CountVowelsInAStringProgram 
{
  public static void main(String args [])
  {
	String abc="Shivlila";
	int l=abc.length();
	 int count=0;
	for(int i=0;i<=l-1;i++)
	{   
		char ch= abc.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			  count++;
			
		}
	}
	System.out.println(count);
	  
  }
}
