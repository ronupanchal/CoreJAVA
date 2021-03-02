class MyThread extends Thread
{
	public void run()
	{	
		for(int i=0;i<10;i++)
		{
			System.out.println("sita thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
	}
}
class JoinDemo
{
	public static void main(String a[])
	{
		try
		{
			MyThread t=new MyThread();
			t.start();
			//t.join(); //or 
			t.join(3000);
			for(int i=0;i<10;i++)
			{
				System.out.println("Rama thread");
			}
		}
		catch(Exception e)
		{}
	}
}