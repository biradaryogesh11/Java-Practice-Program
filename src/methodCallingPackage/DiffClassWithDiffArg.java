package methodCallingPackage;

public class DiffClassWithDiffArg {
	 
	public static void test3(float k)
	{
		System.out.println("My gradution percentage are: "+k);
	}
    public void test4(int s)
    {
    	System.out.println("i like the value: "+s);
    }
    public static void main(String args[])
    {
    	SameClassWithArg.test1( " jspm");
        SameClassWithArg aaa = new SameClassWithArg();
        aaa.test2(411041);
        DiffClassWithDiffArg.test3(64.3f);
        DiffClassWithDiffArg xyz=new DiffClassWithDiffArg();
        xyz.test4(1234);
        
    }
}
