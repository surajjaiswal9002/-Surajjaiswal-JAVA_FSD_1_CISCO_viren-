package Assignment;

import java.util.Scanner;

public class Ass_01_MyCalculator
{ static int temp; 
	
	static long power(int n , int p) throws InvalidNoException
	{
		try
		{
			if(n < 0 || p < 0 )
			{
				throw new InvalidNoException(" n and p should not be negative ");
			}
			else if(n == 0 || p == 0)
			{
				throw new InvalidNoException("n and p should not zero");
			}
			else
			{
				for(int i =1;i<=p;i++)
				{
					temp = n*i;
				}
				return temp;
			}
		}catch (Exception e) 
		{
			System.out.println("Exception accur "+e.getMessage());
		}
		return temp;
		
		
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		System.out.println("Enter the p value");
		int p = sc.nextInt();
		
		try {
			System.out.println(Ass_01_MyCalculator.power(n,p));
		} catch (InvalidNoException e) {
			
			e.printStackTrace();
		}
		
	}

}

class InvalidNoException extends Exception
{
	public InvalidNoException(String s)
	{
		super(s);
	}
}
