package org.Cisco.COnstructor;

public class constructorOverloading 
{
	int id;
	String name;
	int age;
	
	constructorOverloading (int i ,String j)
	{
		id = i;
		name = j;
	}
	
	constructorOverloading (int i, String j,int k)
	{
		 id = i;
		 name =j;
		age = k;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) 
	{
		constructorOverloading  Co = new constructorOverloading (1, "vikram");
		constructorOverloading  co1 = new constructorOverloading (2, "kim", 26);
		
		Co.display();
		co1.display();
		

	}

}
