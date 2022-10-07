package encapulation;

public class Tejaswini
{
   private double balance;
   
   public void setbalance(double balance )
   {
	    this.balance=balance;
	    
   }
   public double getbalance()
   {
	   return balance;
   }
	public static void main(String args[])
	{
		Tejaswini t=new Tejaswini();
		  t.setbalance(200000);
		 double d= t.getbalance();
		 System.out.println(d);
	}
}
