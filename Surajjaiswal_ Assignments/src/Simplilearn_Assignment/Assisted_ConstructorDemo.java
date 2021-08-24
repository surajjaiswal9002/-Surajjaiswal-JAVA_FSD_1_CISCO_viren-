package Simplilearn_Assignment;


//Default Constructor
 class EmpInfo
{
	int id;
	String name;
	
	void display()
	{
		System.out.println(id+ " "+name);
	}
}
 
public class Assisted_ConstructorDemo
{
	public static void main(String[] args)
{
		EmpInfo e1 = new EmpInfo();
		EmpInfo e2 = new EmpInfo();
		
		System.out.println("Default Constructor");
		e1.display();
		e2.display();

}

}
