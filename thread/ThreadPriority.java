public class ThreadPriority extends Thread 
{
	private String threadName;
	ThreadPriority(String threadName) 
     	{
        		this.threadName = threadName;
     	}
   	public void run()
	{
        	System.out.println("Running [" + threadName + "]");
	        for (int i = 1; i <= 5; i++)
		{
            		System.out.println("[" + threadName + "] => " + i);             
            		try 
	    	{
                		Thread.sleep(500);
            		}
		catch (InterruptedException e)
            		{
			System.out.println(e.toString());
            		}
        	}
    	}
 
    	public static void main(String[] args)
     	{
       		ThreadPriority thread1 = new ThreadPriority("First");
		ThreadPriority thread2 = new ThreadPriority("Second");
       		ThreadPriority thread3 = new ThreadPriority("Third");
		ThreadPriority thread4 = new ThreadPriority("Fourth");
	      	ThreadPriority thread5 = new ThreadPriority("Fifth");
 
        //
        // set thread1 to minimum priority = 1
        //
        	thread1.setPriority(Thread.MIN_PRIORITY);
 
        //
        // set thread2 to priority 2
        //
        	thread2.setPriority(5);
 
        //
        // set thread3 to normal priority = 5
        //
        	thread3.setPriority(Thread.NORM_PRIORITY);
 
        //
        // set thread4 to priority 8
        //
        	thread4.setPriority(8);
 
        //
        // set thread5 to maximum priority = 10
        //
        	thread5.setPriority(Thread.MAX_PRIORITY);
		System.out.println("get"+thread3.getPriority());	 
        	thread1.start();
        	thread2.start();
        	thread3.start();
        	thread4.start();
        	thread5.start();
    	}
}
