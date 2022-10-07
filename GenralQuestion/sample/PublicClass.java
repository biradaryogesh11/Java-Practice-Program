package sample;

public class PublicClass extends HDFC
{
	   public static void main(String args[])
	   {
	           PublicClass b= new PublicClass ();
	               b.m1();
	               b.m2();
	   }

}
class SBI
{
public void m1()
{
  System.out.println("m1 method from RBI class");
}
}
class HDFC extends SBI
{
   public void m2()
{
   System.out.println("HDFC&SBI method");
}
}
