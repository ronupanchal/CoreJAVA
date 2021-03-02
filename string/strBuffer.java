public class strBuffer
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Hello..");
		System.out.println("buffer : "+sb);
		System.out.println("length : "+sb.length());
		System.out.println("capacity : "+sb.capacity());

		System.out.println("Char at : "+sb.charAt(1));
		sb.setCharAt(1,'c');
		System.out.println("SetChar at : "+sb);
		sb.setLength(2);
		System.out.println("Length : "+sb);

		sb.append("Good Morning");
		System.out.println("After Append : "+sb);

		sb.insert(2," Very ");
		System.out.println("After Insert : "+sb);

		sb.reverse();
		System.out.println("After reverse : "+sb);
		sb.reverse();

		sb.delete(0,2);
		System.out.println("After delete : "+sb);
		sb.deleteCharAt(6);
		System.out.println("After delete char at : "+sb);

		sb.replace(6,9,"Good");
		System.out.println("After replace : "+sb);

		
		System.out.println("After substring : "+sb.substring(6));

		System.out.println("After substring : "+sb.substring(6,10));

	}
}