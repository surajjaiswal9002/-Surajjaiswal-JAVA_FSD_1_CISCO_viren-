package Simplilearn_Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Assisted_CollectionsDemo
{
	public static void main(String[] args) 
	{
		
		//Hashset
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Kiwi");
		hs.add("Orange");
		
		System.out.println("Hash set "+hs);
		System.out.println("size of Hashset "+hs.size());
		System.out.println(" contains of Hash set "+hs.contains("Apple"));
		System.out.println(" remove of Hash set "+hs.remove("orange"));
		System.out.println(" is empty in Hash set "+hs.isEmpty());
		hs.clear();
		
		// Linked set
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("true");
		ls.add("h");
		ls.add("u");
		ls.add("r");
		ls.add("45");
		
		System.out.println("-----------------------");
		System.out.println("LinkedHash set "+ls);
		System.out.println("size of LinkedHashset "+ls.size());
		System.out.println(" contains of LinkedHAshset "+ls.contains("r"));
		System.out.println(" remove of LinkedHash set "+ls.remove("u"));
		System.out.println(" is empty in LinkedHash set "+ls.isEmpty());
		ls.clear();
		
		
		// tree set
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("India");
		ts.add("Austalia");
		ts.add("England");
		ts.add("Dubai");
		ts.add("us");
		
		System.out.println("-----------------------------");
		System.out.println("Tree set "+ts);
		System.out.println("size of Treeset "+ts.size());
		System.out.println(" contains of Tree set "+hs.contains("India"));
		System.out.println(" remove of Tree set "+ts.remove("us"));
		System.out.println(" is empty in Tree set "+ts.isEmpty());
		ts.clear();
		
		System.out.println();

	}
}