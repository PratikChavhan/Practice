package com.demo.map;

import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap {
	
	// 1. sorted ordered
	// 2. unique keys
	// 3. key and value can be of any type 

	public static void main(String[] args) {
		Map<String, Integer> number = new TreeMap<>();
		
		number.put("One" , 1);
		number.put("Two", 2);
		number.put("Three", 3);
		// number.put("three", 5);  // overwrite three=3 -> three=5
		number.put("Four", 4);
		number.put("Five", 5);
		
		// System.out.println(number);
		
		// System.out.println(number.containsKey("Five"));
		
		// System.out.println(number.containsValue(6));
		
		number.remove("Five");
		
		number.putIfAbsent("Five", 51);
		
		// System.out.println(number);
		
		// System.out.println(number.isEmpty());
		
	// Iterate 
		for(Map.Entry<String, Integer> e : number.entrySet()) {
			 System.out.println(e);
			
			 System.out.println(e.getKey());
			
			 System.out.println(e.getValue());
		}
		
		for(String key : number.keySet()) {
			 System.out.println(key);
		}
		
		for (Integer value: number.values()) {
			 System.out.println(value);
		}
		
	}
}

