package logicalproblem;

public class arm 
{


	  public static void main(String args[])
	{
	    int num=371;
	    int mod;
	    int sum=0;
	    int org=num;
	   while(num>0)
	  {  
	  mod=num%10;
	  int mod1= mod*mod*mod;
	  sum=sum+mod1;
	  num= num/10;
	 }
	  if(org==sum)
	{
	  System.out.println(org+ " this is armstrong number");
	}
	else
	{
	 System.out.println(org+ " this is not armstrong number");
	}
	  
	}
}
