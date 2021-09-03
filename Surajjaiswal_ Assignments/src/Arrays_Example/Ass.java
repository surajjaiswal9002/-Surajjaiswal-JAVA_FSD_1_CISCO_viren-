package Arrays_Example;

import java.util.regex.*;

public class Ass
{
	public static void main(String[] args)
	{
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", "firstname@gmail.com"));
		System.out.println();
	}

}
