//Created By : Chirag
//Date : 26-11-2010
//Program :Non Static variables Example

public class NonStaticVariable
 {
	int noOfInstances;
	NonStaticVariable()
	{
	noOfInstances++;
  }
  public static void main(String[] args){
    NonStaticVariable st1 = new NonStaticVariable();
    System.out.println("No. of instances  for st1  : " + st1.noOfInstances);

    NonStaticVariable st2 = new NonStaticVariable();
    System.out.println("No. of instances  for st1  : " + st1.noOfInstances);
    System.out.println("No. of instances  for st2  : " + st2.noOfInstances);

    NonStaticVariable st3 = new NonStaticVariable();
    System.out.println("No. of instances  for st1  : " + st1.noOfInstances);
    System.out.println("No. of instances  for st2  : " + st2.noOfInstances);
    System.out.println("No. of instances  for st3  : " + st3.noOfInstances);

      }
}