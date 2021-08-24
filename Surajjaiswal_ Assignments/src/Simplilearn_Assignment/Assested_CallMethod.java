package Simplilearn_Assignment;

public class Assested_CallMethod 
{
	int val = 150;
	
	int operation(int val)
	{
		val = val*10/100;
		return val;
	}

	public static void main(String[] args)
	{
		Assested_CallMethod cm = new Assested_CallMethod();
		System.out.println("Before operation value of data is "+cm.val);
		
		cm.operation(100);
		System.out.println("After operation value of data is "+cm.val);
		

	}

}
