package InnerClass;

public class Member_inner
{
	private int data = 30;
	
	void display()
	{
		System.out.println("I am inside the outer class..");
	}
	
	class Inner
	{
		private int data = 20;
		
		//calling a dublicate method in outer class
		void msg()
		{
			Member_inner.this.display();
			System.out.println("data is "+data);
		}
		
		//calling the dublicate method of the outer private variable
		void display()
		{
			System.out.println("I m inside the inner class");
		}
	}
	
	public static void main(String[] args)
	{
		
		Member_inner i = new  Member_inner(); //creating object of outer class
		
		Member_inner.Inner obj = i.new Inner();  //creating obj of inner class
		obj.msg();
		
		//Inner class
		obj.display();
		
		//outer class
		i.display();
	}

}
