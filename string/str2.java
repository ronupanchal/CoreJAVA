public class str2
{
	public static void main(String args[])
	{
		System.out.println(countChar("Java Pro. Language",'a'));
	}
static int countChar(String str, char c) {
        int count = 0 ;
        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == c )
                count++;
        }
        return  count;
        
    }

}