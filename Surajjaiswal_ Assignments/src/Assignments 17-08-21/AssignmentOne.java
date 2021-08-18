package Assignment;


public class AssignmentOne 
{
	public int add(int a , int b)
	{
		return a+b;	
	}
	
	public double add(float r)
	{
		return (3.14*r*r);
	} 
	
	public long add(int b, long h)
	{
		return b*h/2;
	}

	public static void main(String[] args)
	{
		AssignmentOne one = new AssignmentOne();
		System.out.println("Addition of a + b = "+one.add(5, 6));
		System.out.println("Area of the circle = "+one.add(2));
		System.out.println("Area of the Traingle ="+one.add(2, 3));
	}

}
