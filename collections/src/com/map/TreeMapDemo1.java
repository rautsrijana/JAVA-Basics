package com.map;

import java.util.Map;
import java.util.TreeMap;

// Some rule of set will be applicable for key
//key cannot be duplicate
//key can be null
//key must overridden hashcode and equals method

public class TreeMapDemo1 {
	public static void main(String[] args) {
		
//		HashMap<String, String> hmap = new HashMap<>(); //blank hash map
		
		Map<String, String> tmap = new TreeMap<>(); //blank hash map(This one is better)
		tmap.put("ssn008", "Srijana");
		tmap.put("ssn002", "Mohan");
		tmap.put("ssn003", "Sabita");
		tmap.put("ssn001", "Robert");
		tmap.put("ssn001", "Rob"); //ssn001 takes Rob
		
		System.out.println(tmap);
	
		
		Map<String, String> tmap1 = new TreeMap<>(); //blank hash map(This one is better)
		tmap1.put("ssn008", "Srijana");
		tmap1.put("ssn002", "Mohan");
		tmap1.put("ssn003", "Sabita");
		tmap1.put("ssn001", "Robert");
		tmap1.put("ssn001", "Rob"); //ssn001 takes Rob
		
		System.out.println(tmap1);
	
	}
}
