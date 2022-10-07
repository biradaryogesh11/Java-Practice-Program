package abstractionClass;
 
public class Deoni extends Latur                  /// This class also called concrete class       
{                                                      // here we implement the Abstract method
    public void Ausa()
	{
		System.out.println("Ausa from Deoni class");
	}
    public void udgir() 
	{
     System.out.println("udgir from Deoni class");
	}
     public void chakur() 
	{
	System.out.println("Chakur from Deoni class");
	}
     public void nilanga()
     {
    	 System.out.println("Nilanga from Deoni class"); 
     }
	public static void main(String args []) 
	{
		Deoni d= new Deoni();
		d.Ausa();
		d.udgir();
		d.chakur();
		d.nilanga();
		d.ahamadpur();
		System.out.println(d.a);
	}
	
}
