class staticDemo
{
	public static void test()
	{
		System.out.println("Inside test method");
	}
}
public class staticCall
{
	public static void main(String args[])
	{
		staticDemo.test();
	}
}
