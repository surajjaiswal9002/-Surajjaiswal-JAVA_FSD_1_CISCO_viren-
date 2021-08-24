package Simplilearn_Assignment;

public class Assisted_OverloadMethod 
{
	
	public void area(int b , int h)
	{
		System.out.println("Area of Traingle "+(0.5*b*h));
	}
	public void area(int r)
	{
		System.out.println("Area of Circle "+(3.14*r*r));
	}
	
	public static void main(String[] args)
	{
		Assisted_OverloadMethod om = new Assisted_OverloadMethod();
		om.area(10,122);
		om.area(33);

	}

}
