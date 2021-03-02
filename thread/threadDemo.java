public class threadDemo extends Thread
{
   public static void main(String args[]) throws Throwable  
   {
      new threadDemo().start();
   }

   public void run()
   {
      try {
         for (int i=0; i<10; i++) {
System.out.println("thread "+Thread.currentThread().getName()+" step "+i);
            Thread.sleep(3000);
         }
      } catch (Throwable t) { }
   }
}