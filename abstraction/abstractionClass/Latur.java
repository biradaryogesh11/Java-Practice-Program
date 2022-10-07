package abstractionClass;

public abstract class Latur 
{
	 int a=20;                                                   //using abstract keyword you  can not declared varibale
	
	 Latur()                                                     //using abstract keyword you  can not declared Constructor 
	{
		System.out.println("Constructor from Latur class");
	}
    public abstract void Ausa();
    
    public abstract void udgir();
    
    public abstract void chakur();
    
    public void ahamadpur ()                                    // This is called non-Abstract method
    {
    	System.out.println(" ahamadpur from latur class");
    }
    
    public static void main(String args [])                    // Because of abstract class you not able to create object 
    {
    	//Latur l= new Latur();
    }
}
