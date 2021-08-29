package String_Exp;

public class StringDemo {

	public static void main(String[] args) 
	{
		String t = "Delhi";
		String o = "Mumbai";
		String k = "delhi";
		String y = new String("Mumbai");
		String l = new String("delhi");
		String p = new String("Hello");
		
		
		//Using == operator
		System.out.println("Using ==");
		System.out.println(" check o == l");
		if(o == l)
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		System.out.println(" check y == p");
		if(y == p)
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		System.out.println(" check t == o");
		if(t == o)
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		System.out.println(" check k == y");
		if(k == y)
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		
		System.out.println(" check p == y");
		if(p == y)
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		// Equals Operator
		System.out.println("Using Equals");
		System.out.println(" check o equals l");
		if(o.equals(l) )
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		System.out.println(" check y equals p");
		if(y.equals(p))
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		System.out.println(" check t equals o");
		if(t.equals(o))
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		System.out.println(" check k equals y");
		if(k.equals(y))
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		
		System.out.println(" check p equals y");
		if(p.equals(y))
		{
			System.out.println(" True");
		}
		else
		{
			System.out.println("False..");
		}
		
		
		
	}

}
