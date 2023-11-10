package com.demo.map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one" , 1);
		map.put("two", 2);
		map.put("three", 3);
		// map.put("three", 5);  // overwrite three=3 -> three=5
		
		System.out.println(map);
		
	}
}
