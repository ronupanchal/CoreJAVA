class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
class YieldDemo
{
	public static void main(String a[])
	{
		Sample s = new Sample();
		s.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}