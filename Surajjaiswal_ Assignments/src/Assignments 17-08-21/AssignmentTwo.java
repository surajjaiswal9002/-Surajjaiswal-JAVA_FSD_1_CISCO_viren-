package Assignment;

public class AssignmentTwo
{
	int square;
	int rectangle;
	double circle;
	
	
	//constructor
	AssignmentTwo()
	{
		System.out.println("Default Constructor!");
	}
	
	AssignmentTwo(int s)
	{
		this.square=s*s;
	}
	AssignmentTwo(int len,int bth)
	{
		this.rectangle = len*bth;
	}
	
	AssignmentTwo(double r)
	{
		this.circle =3.14*r*r;
	}
	
	
	//method to print value
	void square()
	{
		System.out.println("Area of  Square = "+square);
		
	}
	void rectangle()
	{
		System.out.println("Area of rectangle = "+rectangle);
	}
	void circle()
	{
		System.out.println("Area of Circle = "+circle);	
	}
	
	
	public void Mloading(int p , int q)
	{
		System.out.println("Area of Rhombus = "+p*q/2);
		System.out.println("Area of Traingle = "+(0.5*p*q));
		
	}
	
	public static void main(String[] args) 
	{
		
		AssignmentTwo two1= new AssignmentTwo(5);
		AssignmentTwo two2 = new AssignmentTwo(4,6);
		AssignmentTwo two3 = new AssignmentTwo(43.2);
		
		AssignmentTwo two = new AssignmentTwo();
		two.Mloading(2, 3);
		
		
		two1.square();
		two2.rectangle();
		two3.circle();
	}

}
