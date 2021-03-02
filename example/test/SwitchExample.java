
//Date : 23-11-2010
//Program : Switch Case example

public class SwitchExample{
  public static void main(String[] args) {
    int x, y;
	    
      x = Integer.parseInt(args[0]);
      y = Integer.parseInt(args[1]);
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      int a= Integer.parseInt(args[2]);//for choice input
      switch (a){      
        case 1:
           System.out.println("Enter the number one=" + (x+y));
           break;
        case 2:
          System.out.println("Enter the number two=" + (x-y));
          break;
        case 3:
          System.out.println("Enetr the number three="+ (x*y));
          break;
        case 4:
          System.out.println("Enter the number four="+ (x/y));
          break;
        default:
          System.out.println("Invalid Entry!");
     
    }
   

  }
}