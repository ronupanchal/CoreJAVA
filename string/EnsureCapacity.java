public class EnsureCapacity
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Rose India");
	
		//Returns the current capacity of the String buffer.	
	System.out.println("Buffer : "+sb+"\nCapacity : " + sb.capacity());
//Increases the capacity, as needed,
// to the specified amount in the given string buffer object
		  sb.ensureCapacity(27);
		  System.out.println("New Capacity = " + sb.capacity());
  	}
}