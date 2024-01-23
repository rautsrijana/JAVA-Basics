package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// unordered
// when the key is overridden then it takes that value

public class HashMapDemo1 {
	
	public static void main(String[] args) {
		
//		HashMap<String, String> hmap = new HashMap<>(); //blank hash map
		
		Map<String, String> hmap = new HashMap<>(); //blank hash map(This one is better)
		hmap.put("ssn008", "Srijana");
		hmap.put("ssn002", "Mohan");
		hmap.put("ssn003", "Sabita");
		hmap.put("ssn001", "Robert");
		hmap.put("ssn001", "Rob"); //ssn001 takes Rob
		
		System.out.println(hmap);
		
		Set<Entry<String, String>> entrySet=hmap.entrySet();
		
		for( Entry<String, String> entry:entrySet) {
			System.out.println(entry.getKey()+ " "+entry.getValue());
			
		}
		
		
		

		
		
	}

}
