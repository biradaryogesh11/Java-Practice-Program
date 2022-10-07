package privatePackage1;

public class ClassE  // for class private modifier is not accessible so alway keep public acess modifer for class  //
{

    private int a= 10;                                          // Decleation
	                                                            // Class  == Not Accessible  
	private ClassE ()                                           // veriable === Accessible
	{                                                           // Constructor== Accessible
		System.out.println("Constuctor of classE");
	}
    private void test4()
    {
    	System.out.println("test1 method of classE");
    }
    
    public static void main(String args[])
    {
    	ClassE e1= new ClassE();
    	e1.test4();
    	System.out.println(e1.a);
    	
    }
}
