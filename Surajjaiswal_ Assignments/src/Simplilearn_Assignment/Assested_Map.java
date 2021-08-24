package Simplilearn_Assignment;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Assested_Map {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Tim");
		hm.put(2, "Mary");
		hm.put(3, "catie");
		
		System.out.println("\nThe elements of Hashmap are ");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(4, "Alia");
		ht.put(5, "Rosi");
		ht.put(6, "jack");
		ht.put(7, "hook");
		
		System.out.println("\nThe elements of HashTable are ");
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "anne");
		map.put(9, "rohit");
		map.put(10, "catie");
		
		
		System.out.println("\nThe elements of TreeMap are ");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
	
	}

}
