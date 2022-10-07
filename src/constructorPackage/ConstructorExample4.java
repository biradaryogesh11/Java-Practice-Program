package constructorPackage;

public class ConstructorExample4 
{
    String a;
    String b;
    
    ConstructorExample4()
    {
    	a=("Which food do you like most: ");
    	b=("Which sport  is your faviourate one: ");
    	System.out.println(a+"chiwada");
    	System.out.println(b+"Cricket");	
    }
    ConstructorExample4(int f)
    {
    	a=("where do you live: ");
    	b= ("Pin-code of your area: ");
    	System.out.println(a+"In pune");
    	System.out.println(b+"411041");
    }
    public static void main(String args[])
    {
    	ConstructorExample4 aaa= new ConstructorExample4();
    	ConstructorExample4 bbb= new ConstructorExample4(10);
    }
    
}
