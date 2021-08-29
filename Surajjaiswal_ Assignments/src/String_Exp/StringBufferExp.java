package String_Exp;

public class StringBufferExp
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hy, welcome to ");
		
		sb.append("Cisco permanently  ");
		System.out.println(sb);
		
		sb.insert(30,"Suraj");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.replace(1, 1, "Hello"));
		
		System.out.println(sb.charAt(2));
		
		System.out.println(sb.length());
		System.out.println(sb.codePointAt(1));

	}

}
