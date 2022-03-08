package Assistepractise;

import java.util.HashMap;
import java.util.Map;

import collection.java.LinkedHashMap;

public class MAP {

	public static void main(String[] args) {
		final HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Orange");
        hm.put(2, "Mango");
        System.out.println(hm);
        
        System.out.println("Keys: " + hm.keySet());

        
        System.out.println("Values: " + hm.values());

        
        System.out.println("Entries: " + hm.entrySet());
        }

}
