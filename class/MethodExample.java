
//Date : 25-11-2010
//Program : Method example

public class MethodExample
{
	public static void beginner()
	{
		System.out.println("This is my starter");
		System.out.println("Still in my starter");
	}

	public static void main(String[] args) 
	{ 
		System.out.println("A program to exercise the Java tools");
		beginner();
		another();
		System.out.println("Message from main");
		another();
	}

	public static void noway() 
	{
		System.out.println("This will not happen");
	}

	public static void another()
	{
		System.out.println("I am here"); 
	}
}