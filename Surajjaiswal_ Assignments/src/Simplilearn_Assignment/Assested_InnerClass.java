package Simplilearn_Assignment;

public class Assested_InnerClass 
{
	private String msg ="Welcome to cisco";
	
	
	class Inner
	{
		void hello()
		{
			System.out.println(msg+" Let us learning Inner Classes ");
		}
	}
	
	
	public static void main(String[] args)
	{
		Assested_InnerClass ic = new Assested_InnerClass();
		Assested_InnerClass.Inner i = ic.new Inner();
				i.hello();
	}

}
