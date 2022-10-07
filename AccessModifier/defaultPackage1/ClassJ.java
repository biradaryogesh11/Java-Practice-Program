package defaultPackage1;



 class ClassJ 
{
 int a= 10;                                                    // Decleation
 
                                                              // Class  ==  Accessible  
 ClassJ ()                                                   // veriable === Accessible
{                                                           // Constructor== Accessible
System.out.println("Constuctor of classJ");                 //  method== Accessible
}
 void test4()
{
System.out.println("test1 method of classJ");
}

public static void main(String args[])  //  Default access modifier accessible in within class
{
ClassJ j1= new ClassJ();
j1.test4();
System.out.println(j1.a);
	
}
}