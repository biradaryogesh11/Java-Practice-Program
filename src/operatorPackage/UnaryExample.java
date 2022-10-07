package operatorPackage;

public class UnaryExample {
	
	
	public static void main(String args [])               
	{      int a = 20;
		System.out.println(a++); //20 (20+1=21)
		System.out.println(a++); //21  22
		System.out.println(a++); //22  23
		System.out.println(++a); //24                  
		System.out.println(a--); //24 23         
		System.out.println(a++); //23 24
		System.out.println(--a); //23
		System.out.println(a++); //23 24
		System.out.println(--a); //23
		System.out.println(a++); //23 24
		System.out.println(a++); //24 25
		System.out.println(--a); // 24
		System.out.println(a--); //24 23
		System.out.println(a++); //23 24
		System.out.println(--a); //23
		System.out.println(a++); //23 24
		System.out.println(a--); // 24
	}

}
