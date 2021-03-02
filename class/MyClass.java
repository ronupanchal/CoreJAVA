
//Date : 26-11-2010
//Program : Static Method Example

class Comparator 
{
        public static int max(int a, int b)
        {
                if( a > b)
                        return a;
                else
                        return b;
        }

}

class MyClass 
{
  public static void main(String args[])
  {
       
        int a = 12;	
        int b = 14;

        System.out.println(Comparator.max(a, b));
        System.out.println(Comparator.max(234,567)); 
  }
}
