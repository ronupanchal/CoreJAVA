public class NestedEx
{
	public static void main (String arg[])
	{
       		try
       		{
			System.out.println("outer try");
          		try
          		{
			        System.out.println(10/0);
		        }
          		catch(ArithmeticException e)
          		{
		        	System.out.println("arithmetic exception");
          		}
         		finally
          		{
			        System.out.println("inner finally");
          		}
       		}
       		catch(Exception e)
       		{
		        System.out.println("exception");
      		}
       		finally
          	{
           	   	System.out.println("outer finally");
          	}
	}
}
