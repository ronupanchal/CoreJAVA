class ThrowDemo
{
	static void throwone() throws IllegalAccessException
	{
		System.out.println("Inside Throw");
		throw new IllegalAccessException("Throw Demo");
		
	}
	public static void main(String a[])
	{
		try
		{
			throwone();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("Error Caught "+e.toString());
		}
	}
}
