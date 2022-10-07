package interfaceEx;

public interface Vechile 
{
    
	 final  int a=10;
    void test();
    void start();
    void stop();
    private void test1() // scope is within the class
    { System.out.println("test1 from vechile");
     }
    public static void test2()// not accessable in other class because static method need class name to call it in main method
    {System.out.println("test2 from vechile");
    }
    default void test3()
    {System.out.println("test3 from vechile");
    }
    public static void main(String args[])
    {
    	//Vechile v=new Vechile();
    }
    
    
}
