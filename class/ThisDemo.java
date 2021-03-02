
//Date : 26-11-2010
//Program : This Keyword Example

class ThisDemo
{
	int a = 0;
	int b = 0;
	ThisDemo(int x, int y)
	{
		this.a = x;
		this.b = y;
	}
	public static void main(String args[])
	{
		ThisDemo td = new ThisDemo(10,12);
		//ThisDemo td1 = new ThisDemo(100,23);
		System.out.println(td.a); // prints 10
		System.out.println(td.b); // prints 12
		//System.out.println(td1.a);// prints 100
		//System.out.println(td1.b);// prints 23
	}
}
