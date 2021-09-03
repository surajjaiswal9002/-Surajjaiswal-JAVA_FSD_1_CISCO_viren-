package Regular_Example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment3
{
	private static boolean isValidPassword(String s)
	{
		Pattern p = Pattern.compile("[A-Z]+\\d{3}[a-zA-Z]*");
		Matcher m = p.matcher(s);
		
		
		return(m.find()&&m.group().equals(s));
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.next();
		
		if(isValidPassword(s))
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
		
		//System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "A123wertgh"));
	}

	
	

}
