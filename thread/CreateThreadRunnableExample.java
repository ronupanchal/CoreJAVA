public class CreateThreadRunnableExample implements Runnable
{
 
        public void run()
	{
               
                for(int i=0; i < 5; i++)
		{
                        System.out.println("Child Thread : " + i);
                       
                        try
			{
                                Thread.sleep(500);
                        }
                        catch(InterruptedException ie)
			{
                                System.out.println("Child thread interrupted! " + ie);
                        }
                }
               
                System.out.println("Child thread finished!");
        }
       
        public static void main(String[] args) 
	{              
                Thread t = new Thread(new CreateThreadRunnableExample(), "My Thread");
               
                t.start();
               
                for(int i=0; i < 5; i++)
		{
                       
                        System.out.println("Main thread : " + i); 
                        try
			{
                                Thread.sleep(1000);
                        }
                        catch(InterruptedException ie)
			{
                                System.out.println("Child thread interrupted! " + ie);
                        }
                }

                System.out.println("Main thread finished!");
        }
}