//Created By : Chirag
//Date : 01-12-2010
//Program : Intreface with Method Example


interface calculate
{
	int a = 10;
	public double getValue(double a, double b);
}

class square implements calculate
{
	public double getValue(double a, double b)
	{
		return a*b;
	}
}

class cylinder implements calculate
{
	public double getValue(double a, double b)
	{
		return 2*3.14*a*b;
	}
}

class intExample
{
	public static void main(String args[])
	{
		square sqr = new square();
		cylinder cyl = new cylinder();
		System.out.println("Square :"+sqr.getValue(5,3));
		System.out.println("Cylinder :"+cyl.getValue(3,5));
		System.out.println("a: "+a);
	}
}