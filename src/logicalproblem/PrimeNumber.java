package logicalproblem;

public class PrimeNumber 
{
	
	// prime number = 2,3,5,7,11,13,17,19,23 etc
	
	public static void main(String args[])
	{
		int num=15;
		int mod;
		int ans;
		int count=0;
		
		for(int i=num;i>=1;i--)
		{
			mod=num%i; 
	         
			
			if(mod==0)
			{ 
				count++;
			
			}
		}
			if(count==2 )
			{
				System.out.println("this is the prime number: "+num); 
			}
//			else if(num==1||count==2)
//			{
//				
//				System.out.println("this is the prime number: "+num); 
//			}
			else
			{
				System.out.println("this is not the prime number: "+num); 
			}
				
				
			
		
		
		
	}
	

}
