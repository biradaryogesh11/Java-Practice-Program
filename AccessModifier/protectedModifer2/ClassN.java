package protectedModifer2;

public class ClassN
{

	public static void main(String args[]) //outside class but within package protected modifier is accessible
	{
		ClassM m1= new ClassM();
		m1.test4();
		System.out.println(m1.a);

		
	}
}
