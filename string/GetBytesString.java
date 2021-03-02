public class GetBytesString
{
    public static void main(String[] args)
    {
        String str1 = "Java Programming Language";
    //Convert this String into bytes according 
	//to the platform's default character encoding, 
	//storing the result into a new byte array.
         System.out.println(str1.getBytes());
        }
        
}