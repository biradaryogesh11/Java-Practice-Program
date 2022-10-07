package constructorPackage;

public class ConcatationExample 
{
     String name;
     int age;
     String Education;
     ConcatationExample (String d)
     {
    	name= "Yogesh Biradar";
    	age = 27;
    	Education="Mechnical Engineering";
     }
     ConcatationExample(int f)
     {
    	 name="Mangesh Biradar";
    	 age = 29;
    	 Education="Computer Engineering";
     }
     ConcatationExample (char l)
     {
    	 name="somesh biradar";
    	 age = 25;
    	 Education="Agriculter Engineering";
     }
     public void test()
     {
    	 System.out.println(" ");
    	 System.out.println("Brother name: "+name);
    	 System.out.println("age: "+age);
    	 System.out.println("Education: "+Education);
     }
      public static void main(String args[])
     {
    	 ConcatationExample aaa = new ConcatationExample("hi");
    	 ConcatationExample aaa1 = new ConcatationExample(12);
    	 ConcatationExample aaa2 = new ConcatationExample('b');
//    	 aaa.test();
//    	 aaa1.test();
    	 aaa2.test();
     }
   
}
