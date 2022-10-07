package constructor1;

public class Example111 { // decleration 
	
	int aa ;
	int bb ;
	 
	Example111 () // intilisation
	{
		
		aa= 43 ;
		bb = 72 ;
			
	}
	
	public static void main(String args[]) // usages
	{
		Example111 name = new Example111 ();
		System.out.println(name.aa);
		System.out.println(name.bb);
		
	}
	

}
