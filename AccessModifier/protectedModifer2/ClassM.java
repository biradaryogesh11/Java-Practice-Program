package protectedModifer2;



public class ClassM
{
protected int a= 25;                                            // Decleation
                                                               // Class  == Not Accessible  
protected ClassM ()                                           // veriable === Accessible
{                                                            // Constructor== Accessible
System.out.println("Constuctor of classM");                 // method === Accessible   
}
protected void test4()
{
System.out.println("test4 method of classM");
}

public static void main(String args[])  // protected access modifier accessible in within class
{
ClassM m1= new ClassM();
m1.test4();
System.out.println(m1.a);

}
	
	
}
