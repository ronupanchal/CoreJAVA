class Main
{
	void Show()
	{
		System.out.println("Main Class");
	}
}
class Child extends Main
{
	void Show()
	{
		System.out.println("Child Class");
	}

}
class OverrideDemo
{
	public static void main(String args[])
	{
		Main m = new Main();
		Child c = new Child();
		m.Show();
		c.Show();
	}
}