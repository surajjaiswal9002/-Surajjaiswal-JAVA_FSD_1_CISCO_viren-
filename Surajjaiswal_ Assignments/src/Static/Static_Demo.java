package Static;

public class Static_Demo 
{
	static int u =90;
	
	private static void outerMethod()
	{
		System.out.println("inside outer method");
	}

	//static inner
	static class Inner 
	{	
	public static void main(String[] args) 
	{
		System.out.println("inside the inner method "+u);
		outerMethod();
		
	}

}
}
	
