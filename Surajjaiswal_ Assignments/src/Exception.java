
public class Exception 
{

	public Exception(String s) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) 
	{
		try
		{
			checkException();
			
			int arr[] =  {55,55,};
			
		}
		finally
		{
			System.out.println("Finally outside method");
		}
	} 
	
	
	public static void checkException()
	{
		try
		{
			int res = 3/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(" ArithmaticsException");
		}
		finally
		{
			System.out.println("Finally inside Method");
		}
	}

}
