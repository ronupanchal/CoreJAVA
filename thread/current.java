 class current   
 {  
      public static void main(String[] args)   
      {  
           System.out.println("Let's find current thread.. ");  
           Thread th=Thread.currentThread();  
           System.out.println("Current thread is: "+th);  
           System.out.println("Thread name is: "+th.getName());  
           System.out.println("Thread priority is: "+th.getPriority());  
           System.out.println("Thread is alive: "+th.isAlive());  
      }  
 } 