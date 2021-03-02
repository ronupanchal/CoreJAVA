public class ExceptionDemo
{
	public static void main(String args[])
	{
		int i ;
		try
		{
			i = Integer.parseInt("c");
			System.out.println("This will not execute if Error Occurs");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error in Number Foramt : "+e.toString());	
		}
	}
}
