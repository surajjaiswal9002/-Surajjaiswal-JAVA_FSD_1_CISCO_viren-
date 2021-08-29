package InnerClass;

public class Method_Innerclass
{
	private int age =23;
	
	void display()
	{
		System.out.println(" Inner method ..");
	}
	
	 void outerMethod()
	 {
		 System.out.println("Inside the Inner method..");
	 
	 
	 class Inner  //inside the method creating a class
	 {
		 void innerMethod()
		 {
			 display();
			 System.out.println("inside the innerMethod age is "+age);
		 }
	 }
	 Inner i = new Inner();  //creater the inner calss obj
	 i.innerMethod(); // calling the method
	 
	 }
	
	public static void main(String[] args)
	{
		
		Method_Innerclass mi = new Method_Innerclass();
		mi.outerMethod(); //calling outer class method
	}

}
