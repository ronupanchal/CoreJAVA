class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("I got interrupted");
			}
		}
	}
}
class IntDemo
{
	public static void main(String a[])
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
	}
}