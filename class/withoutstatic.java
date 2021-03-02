class staticDemo
{
	public void test()
	{
		System.out.println("Inside test method");
	}
}
public class withoutstatic
{
	public static void main(String args[])
	{
		staticDemo sd = new staticDemo();
		sd.test();
	}
}
