package collection.java;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		 
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		
		
		hmap.put(1, "Apple");
		hmap.put(2, "Mango");
		hmap.put(3, "dragonfruit");
		hmap.put(4, "lichi");
		hmap.put(5, "trawberry");
		hmap.put(6, "Watermelon");
		hmap.put(7, "Custored-Apple");
		hmap.put(8, "Banana");
		hmap.put(9, "kiwi");
		hmap.put(10, "Orange");
		
		System.out.println(hmap);
		
		
		 for (HashMap.Entry<Integer,String> entry : hmap.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	    
		hmap.remove("lichi");
		hmap.remove(7);
		System.out.println(hmap);
		
		System.out.println(hmap.containsValue("banana"));
		System.out.println(hmap.containsValue("Apple"));
		
		
		System.out.println(hmap.containsKey(4));
		
		
		System.out.println(hmap.hashCode());
		
		
		//System.out.println(hmap.clear());
		
		
		
		

	}

}
