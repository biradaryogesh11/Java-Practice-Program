package veriableExample;

public class NonStaticVariableEx1
{

          int a = 1218;
          int b = 3455;
      
      public void test1()
      {
    	  float aa = b/a;
    	  int bb = a+b;
    	  System.out.println(aa);
    	  System.out.println(bb);
   	  }
      
      public static void main(String args[])
      {
    	  NonStaticVariableEx1 obj = new NonStaticVariableEx1();
    	  obj.test1();
    	  System.out.println(obj.a);
    	  System.out.println(obj.b);
    	  System.out.println(obj.a*obj.b);
    	  
      }
   
}
