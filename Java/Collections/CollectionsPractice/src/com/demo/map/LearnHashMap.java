package com.demo.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		
		// 1. unordered
		// 2. unique keys
		// 3. key and value can be of any type 
		
		Map<String, Integer> number = new HashMap<>();
		
		number.put("one" , 1);
		number.put("two", 2);
		number.put("three", 3);
		// number.put("three", 5);  // overwrite three=3 -> three=5
		number.put("four", 4);
		number.put("five", 5);
		
		System.out.println(number);
		
		// System.out.println(number.containsKey("five"));
		
		// System.out.println(number.containsValue(6));
		
		number.putIfAbsent("five", 51);
		
		// System.out.println(number);
		
		// System.out.println(number.isEmpty());
		
		number.remove("one");
		
	// Iterate 
		for(Map.Entry<String, Integer> e : number.entrySet()) {
			// System.out.println(e);
			
			// System.out.println(e.getKey());
			
			// System.out.println(e.getValue());
		}
		
		for(String key : number.keySet()) {
			// System.out.println(key);
		}
		
		for (Integer value: number.values()) {
			// System.out.println(value);
		}
		
	}
}
