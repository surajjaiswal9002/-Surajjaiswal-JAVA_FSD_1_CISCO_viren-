package QueueExp;

import java.util.LinkedHashMap;
import java.util.Map;

public class MAPExp {

	public static void main(String[] args)
	{
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(1, "Samsung");
		map.put(2, "Nokia");
		map.put(3, "Toshiba");
		map.put(4, "Cisco");
		
		
		System.out.println("Content of LinkedHAshMap "+map);
		System.out.println("\nValues of map afetr iterating over it :");
		
		for(Integer key: map.keySet())
		{
			System.out.println(key+ ":\t"+map.get(key));
		}
		
		System.out.println("\nYhe Size of the linkedHashMAp is "+map.size());
		System.out.println("\nIs LinkedHashMap is empty? :"+map.isEmpty());
		System.out.println("\nconatins 2 as key? "+map.containsKey(3));
		System.out.println("\nRemove entry for key 3 :"+map.remove(4));
		System.out.println("\ncontent of linkedhashmap after remove key "+map);
		
		map.clear();
		System.out.println("\ncontent pf listhashmap after clearing "+map);
	}

}
