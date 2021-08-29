package Assignment;

import java.util.Scanner;

public class Ass_2_Palindrum 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String s = sc.nextLine();
		
		
		String rev="";
		
		for(int i = s.length()-1;i>=0;i--)
			rev = rev + s.charAt(i);
			
			if(s.equals(rev))
			{
				System.out.println(rev+"Palindrum ");
			}
			else
			{
				System.out.println(rev+" not a palindrum");
			}
		
		

	}

}
