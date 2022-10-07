package operatorPackage;

public class RelationalOperator {
 
	public static void main(String args[])
	{
	     int a =47;
	     short b= 100;
	     byte c= 120;
	     float g= 178.5f;
	     double k= 4545.4544;
	     char l= 120 ;
	  
	     System.out.println(a>b);  //false
	     System.out.println(a>c);  //false
	     System.out.println(c<=g); //true
	     System.out.println(k>=b); //true
	     System.out.println(c==l); //true
	     System.out.println(a!=b); //true
	     System.out.println(l<k);  //true
	     System.out.println(a>=c); //false
	     System.out.println(c==g); //false
	     System.out.println(k>=b); //true
	     System.out.println(b<c);  //true
	     System.out.println(a!=b); //true
	     System.out.println(a==b); //false
	     System.out.println(g>=c); //true
	}
	
}
