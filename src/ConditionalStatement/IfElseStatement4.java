package ConditionalStatement;

public class IfElseStatement4 {
	
	public static void main(String args[])
	{
		// WAP to verify your from ---- city -  (Mumbai, Pune, Delhi, Chennai)
		
		String city= "mumbai";
		
		if (city == "pune"|| city=="mumbai" ||city== "chennai"||city=="delhi")
		{
			System.out.println("I am from  "+city );
		}
		else
		{
			System.out.println("you are not from pune city");
		}
		
		
		
		
	}

}
