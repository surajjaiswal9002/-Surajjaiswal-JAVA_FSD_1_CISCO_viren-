
public class CustomExp
{
	static  void validate(int age) throws InvalidAgeException
	{
		if(age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("Welcome to vote");
		
	}

	public static void main(String[] args) 
	{
		
		try
		{
			validate(17);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e.getMessage);
		}
		System.out.println("REst of the code");
	}

}

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String s)
	{
		super(s);
	}
}
