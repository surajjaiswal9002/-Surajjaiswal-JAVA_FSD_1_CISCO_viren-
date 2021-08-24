package Simplilearn_Assignment;

class std
{
	int id;
	String name;
	
	std(int i , String n)
	{
		id  = i;
		 name = n;
		 
	}
	
	void display()
	{
		System.out.println(id+ " "+name);
	}
	
}


public class Assisted_ParamConstDemo 
{

	public static void main(String[] args)
	{
		std s1 = new std(1," Alex");
		std s2 = new std(10,"Suraj");
		
		s1.display();
		s2.display();
		

	}

}
