class ExampleThrow
{
	static void divide() throws ArithmeticException
	{
		int x=22,y=0,z;
		z=x/y;
	}
	public static void main(String args[])
	{
		try
		{
			divide();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("cught the exception --->"+ae);
		}
	}
	
}