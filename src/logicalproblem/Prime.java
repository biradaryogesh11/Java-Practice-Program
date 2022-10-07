package logicalproblem;

public class Prime 
{
    public static void main(String args[])
{    
    int num=125;
 int  count=0;
for(int i=1;i<=num;i++)
{
  int mod= num/i;
 if(mod==0)
{   
	 count++;
}
 
}
if(count==2 )
{
	System.out.println("this is the prime number: "+num); 
}
else
{
	System.out.println("this is not the prime number: "+num); 
}

}
}
