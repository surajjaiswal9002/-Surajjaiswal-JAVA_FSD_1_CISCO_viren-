package Regular_Example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Assiment2
{
	private static boolean isValidNo(String s)
	{
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		
		Matcher m = p.matcher(s);
		
		return(m.find() && m.group().equals(s));
	}

	

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile no");
		String s = sc.next();
		
		
		
		if(isValidNo(s))
		{
			System.out.println("India number");
		}
		else
		{
			System.out.println("Other country number");
		}
		
		String regex = "^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d";
		
		System.out.println(Pattern.matches(regex, "n"));
	}

	
	

}