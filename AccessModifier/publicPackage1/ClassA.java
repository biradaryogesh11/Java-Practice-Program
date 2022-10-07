package publicPackage1;

//Decleation

//Class  ==  Accessible 
// veriable === Accessible
//Constructor== Accessible
//method== Accessible

public class ClassA
{
	public int a= 10;
	
	public ClassA ()
	{
		System.out.println("Constuctor of classA");
	}
    public void test1()
    {
    	System.out.println("test1 method of classA");
    }
    
    public static void main(String args[])  //  public modifier accessible in within class
    {
    	ClassA a1= new ClassA();
    	a1.test1();
    	System.out.println(a1.a);
    }
}
