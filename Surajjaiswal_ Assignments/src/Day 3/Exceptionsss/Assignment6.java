package Exceptionsss;

public class Assignment6
{
	static void valid(int sal) throws InvalidSalException
	{
		if(sal < 2000)
		{
			throw new InvalidSalException("You need to work hard..");
		}
		
		if( sal > 2100 || sal <= 5000)
		{
			throw new InvalidSalException("You sal is some how good");
		}
		if( sal > 5100|| sal <= 9000)
		{
			throw new InvalidSalException("You sal is very good");
		}
		else
		{
			System.out.println("sal is not valid");
		}
		
	}
		

	public static void main(String[] args) 
	{
		try
		{
			valid(2000);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e.getMessage());
		}
		System.out.println("REst of the code");
	}

}
class InvalidSalException extends Exception
{
	public InvalidSalException(String s)
	{
		super(s);
	}
}
