package org.Cisco.COnstructor;

public class Example
{	int id;
	String name;
	
	
	Example(int a , String b)
	{
		id = a;
		name = b;
	}
	
	void display()
	{
		System.out.println(id+" " +name);
	}

	public static void main(String[] args) 
	{
		
		Example E1;
		E1 = new Example(1, "viven");
		
		Example E2 = new Example(2, "savi");
		
		E1.display();
		E2.display();
		
	}

}
