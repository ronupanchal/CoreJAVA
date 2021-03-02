public class exceptions
{
	public static void main(String Args[])
	{
		int[] array = new int[3];
	        try
		{
	        	for(int i=0;i<4;++i)
			{
	                	array[i] = i;
	            	}
	            System.out.println(array);
	        }
	        catch(ArrayIndexOutOfBoundsException e)
		{
	    //printed just to inform that we have entered the catch block
	        	System.out.println("Catch Statement");
	        }
	        finally
		{
	        	System.out.println("Array : "+array);
			for (int j=0;j<array.length;j++)
			{
				System.out.println("Array Content : "+array[j]);	
			}
	            //method call to continue program
	        }
	}
}
