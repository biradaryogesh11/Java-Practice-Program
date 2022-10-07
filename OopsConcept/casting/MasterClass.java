package casting;

public class MasterClass
{
  public static void main(String args[])
  {
	  Parent p= new Child ();
	   p.home();
	   p.car();
	   
	   Child c= (Child)p;
	   c.bike();
	   c.car();
	   c.home();
	   c.laptop();
	   
  }
}
