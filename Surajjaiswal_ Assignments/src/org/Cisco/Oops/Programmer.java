package org.Cisco.Oops;

class Employee
{
	float salary= 40000f;
	int bonus = 5600;
	
	public void show()
	{
		System.out.println("Inside the parent class");
	}
	
	public void display()
	{
		System.out.println("we are in display class");
	}
}



public class Programmer  extends Employee
{
	int bonus = 10000;
	
	public void show()
	{
		System.out.println("Bonous of Emplaoyee"+this.bonus);
		System.out.println("inside the child class");
	}

	public static void main(String[] args) 
	{
		Programmer p = new Programmer();
		System.out.println("programmer sallary is"+p.salary);
		System.out.println("Bonus of programmer "+p.bonus);
		p.show();
		p.display();
	}

}
