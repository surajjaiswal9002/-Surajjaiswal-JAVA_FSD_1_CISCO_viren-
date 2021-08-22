package Collection_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment_7
{
	public static void main(String[] args) 
	{
		LinkedHashSet l1 = new LinkedHashSet();
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nno");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int n7 = sc.nextInt();
		
		
		
		
		
		l1.add(45);
		l1.add(55);
		l1.add(567f);
		l1.add(765f);
		l1.add('C');
		l1.add("True");
		System.out.println("L1 data "+l1);
		
		l2.add(n);
		l2.add(n1);
		l2.add(n2);
		l2.add(n3);
		l2.add(n4);
		l2.add(n5);
		l2.add(n6);
		l2.add(n7);
		
		System.out.println("LinkedHashset l2 "+l2);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Java");
		ts.add("Python");
		ts.add("Ruby");
		ts.add("C");
		ts.add("C++");
		ts.add("JAvaScript");
		
		System.out.println(" treeset inputs :"+ts);
		System.out.println(" Remove 2 value :"+ts.remove("Python")+" "+ts.remove("Ruby"));
		
		System.out.println("add 3 value: "+ts.add("PHP")+" "+ts.add("Python")+" "+ts.add("Advance java"));
		System.out.println(" check java "+ts.contains("Java"));
		ts.clear();
		System.out.println("After clear ts data "+ts);
			
	}

}
