import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ThrowExp
{

	static int add(int num1 , int num2) throws IOException
	{
		if(num1 > 900)
		{
			throw new ArithmeticException("Num 1 is greater than 900 and hence Exception");
		}
		else
		{
			throw new IOException(" Check the number and hence Exceptuion");
		}
	}
	
	public static void main(String[] args) 
	{
		int r=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd ");
		int num2 = sc.nextInt();
		
		try
		{
			r = add(num1, num2);
		}
		catch(ArithmeticException | IOException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Result is: "+r);

	}

}
