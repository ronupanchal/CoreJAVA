class arr{
	int[] array=new int[3];
    void getData()
	{
	   
	   for(int i=1;i<3;i++)
	   {
	      array[i]=i+10;
	   }
	}
	void display()
	{
	  for(int i=1;i<3;i++)
	  {
	      System.out.println("array["+i+"]:"+array[i]);
	  }
	}
}
class arrDemo 
{
  public static void main(String arg[])
  {
      arr a1=new arr();
	  a1.getData();
	  a1.display();
  }  
}