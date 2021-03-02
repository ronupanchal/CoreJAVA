class A extends Thread
{
    public void run()
    {
      System.out.println("I am in Thread A");
    }
}
class ThreadDemo1
{
  public static void main(String args[])
  {
   A a =new A();
   
a.start();
}
}