import java.io.*;
public class userdef
{
   public static void main(String args[])
    {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a;
    float b;
    try{
      System.out.print("Enter your a: ");
      a = Integer.parseInt(in.readLine());
System.out.print("Enter your b: ");
      b= Float.parseFloat(in.readLine());
      System.out.println("a is :"+a);

System.out.println("b is :"+b);	}
    catch(Exception e){
      System.out.println(e.toString());
    }
   }
}