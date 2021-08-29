package cisco.Examples.oops;


abstract class AbstractionJava
{
	private String name = "Navi";
	
	AbstractionJava()
	{
		System.out.println("Inside the abstract class:");
	}
	public void mymethod()
	{
		System.out.println("Hello" +name);
	}
	
	abstract public void anothermethod();
	
}
	
 class BasicAbstractExample extends AbstractionJava
{
	public BasicAbstractExample()
	{
		System.out.println("Inside child method:");
	}
	
	public void anothermethod()
	{
		System.out.println("Abstract method:");
	}
	
	public static void main(String[] args) {
		AbstractionJava obj = new BasicAbstractExample();
		
		obj.anothermethod();
		obj.mymethod();
	}
}
