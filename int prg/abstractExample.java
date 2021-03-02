
abstract class calculate
{
	abstract double getValue(double a, double b);
}

class square extends calculate
{
	public double getValue(double a, double b)
	{
		return a*b;
	}
}

class cylinder extends calculate
{
	public double getValue(double a, double b)
	{
		return 2*3.14*a*b;
	}
}

class abstractExample
{
	public static void main(String args[])
	{
		square sqr = new square();
		cylinder cyl = new cylinder();
		System.out.println("Square :"+sqr.getValue(5,3));
		System.out.println("Cylinder :"+cyl.getValue(3,5));
	}
}