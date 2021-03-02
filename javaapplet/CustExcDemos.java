public class CustExcDemos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt;	
		String str;
                float x;
		cnt = args.length;
		
                for(int i =0 ;i<cnt;i++)
                {
                        x=Float.parseFloat(args[i]);
                        //StringBuffer s=new StringBuffer(str);
                        //s.reverse();
                        //System.out.println("Reverse is " + s);
                        System.out.println(i+" Java is " + x + " ! ");
                }
		
			
	}

}
