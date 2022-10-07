package constructorPackage;

public class ArgConSample 
{
	ArgConSample()
	{
		System.out.println("My");
	}
	ArgConSample(String a)
	{
		System.out.println("Name");	
	}
	ArgConSample(int b)
	{
		System.out.println("Is Yogesh");	
	}
	public static void main(String args[])
	{
		ArgConSample obj = new ArgConSample();
		ArgConSample aaa = new ArgConSample("aa");
		ArgConSample bbb = new ArgConSample(10);
	}
}
