/*
  @Author Ronak
*/

class Purple 
{
	Purple() 
	{
		System.out.println("Purple running ");
	}
}
class Violet extends Purple 
{
	Violet() 
	{
		System.out.println("Violet running " );
	}
}
public class Inheritance2 
{
	public static void main(String[] args) 
	{
		Violet v = new Violet();
	}
}

