package sample;

public class DifferentClass 
{
	public static void main(String args[])
	{
	  G g= new G();
	    g.m1();
	  H h=new H();
	     h.m2();
	  F f= new F();
	     f.m3(); 

	}
}
class G
{
  public void m1()
{
  System.out.println("m1 method");
}

}
class H
{
public void m2()
{
  System.out.println("m2 method");

}

}
class F
{
public void m3()
{
 System.out.println("m3 method");
}

}