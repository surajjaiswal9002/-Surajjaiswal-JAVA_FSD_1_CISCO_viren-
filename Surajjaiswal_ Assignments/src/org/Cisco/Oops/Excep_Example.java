package org.Cisco.Oops;

public class Excep_Example
{

	public static void main(String[] args) throws Exception
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
