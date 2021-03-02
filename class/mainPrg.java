public class Main
{
	Main(int a, int b)
	{
		System.out.println("a-->"+a+"b-->"+b);
	}
}
public class Child extends Main
{
	Child()
	{
		super(3,5);
	}
}
public class mainPrg
{
	public static void main(String args[])
	{
		Child c = new Child();		
	}
}