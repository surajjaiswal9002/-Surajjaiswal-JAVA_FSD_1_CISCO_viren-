package Stack_Example;

import java.util.Scanner;
import java.util.Stack;

public class Example1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element u take");
		int n = sc.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
			s.push(sc.nextInt());
		}
		
		//remove the element
		System.out.println("remove "+s.pop());
		System.out.println("remove "+s.pop());
		
				//top element
				System.out.println("Top element "+s.peek());
				
				//search the element
				System.out.println("Search the elements "+s.search(1));
				System.out.println("Search the elements "+s.search(2));
				System.out.println("Search the elements "+s.search(0));
		
		
		
		
	
		
		
		

	}

}
