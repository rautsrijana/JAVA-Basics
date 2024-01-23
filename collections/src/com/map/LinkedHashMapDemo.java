package com.map;

import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, String> lhmap = new LinkedHashMap<>(); //blank hash map(This one is better)
		lhmap.put("ssn008", "Srijana");
		lhmap.put("ssn002", "Mohan");
		lhmap.put("ssn003", "Sabita");
		lhmap.put("ssn001", "Robert");
		lhmap.put("ssn001", "Rob"); //ssn001 takes Rob
		
		System.out.println(lhmap);
	}
}
