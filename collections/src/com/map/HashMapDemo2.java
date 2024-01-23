package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// unordered
// when the key is overridden then it takes that value
// Remember all these things
public class HashMapDemo2 {
	
	public static void main(String[] args) {
		
//		HashMap<String, String> hmap = new HashMap<>(); //blank hash map
		
		Map<String, String> hmap = new HashMap<>(); //blank hash map(This one is better)
		hmap.put("ssn008", "Srijana");
		String oldvalue = hmap.put("ssn002", "Mohan");
		System.out.println(oldvalue);
		hmap.put("ssn003", "Sabita");
		hmap.put("ssn001", "Robert");
		String oldValue1=hmap.put("ssn001", "Rob"); //ssn001 takes Rob
		System.out.println(oldValue1);
		
		//return the set of keys separately
		Set<String> setOfKey = hmap.keySet();
		System.out.println(setOfKey);
		
		Collection<String> setofvalues = hmap.values();
		System.out.println(setofvalues);
		
		
		System.out.println(hmap.containsKey("trump")); //faLSE
		System.out.println(hmap.containsKey("ssn001")); //TRUE
		System.out.println(hmap.containsValue("Srijana")); //TRUE
		
		

		
		
	}

}
