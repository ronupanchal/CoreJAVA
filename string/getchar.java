public class getchar
{
    public static void main(String[] args)
	{
    		String str = "How are you.";
		char[] arr = new char[15];
		str.getChars(2, 10, arr, 1);
		System.out.print("The Character array equals:");		
		System.out.println(arr);
    }
}