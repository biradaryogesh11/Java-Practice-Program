package logicalproblem;

public class DuplicateChar 
{
	public static void main(String args[])
	{
    String s="anmol kotalwar";
    int count;
    int l=s.length();
    char s1[]=s.toCharArray();
    System.out.println(s1);
    for(int i=0;i<l;i++)
    { 
     	count=1;
    	for(int j=i+1;j<l;j++)
    	{
    		if(s1[i]==s1[j]&&s1[i]!=' ')
    		{
    			count++;
    			s1[j]='0';
    		}
    	}
    	if(count>1&&s1[i]!='0')
    	{
    		System.out.println(s1[i]);
    	}
    }
	}
}
