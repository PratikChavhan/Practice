package com.demo.set;

import java.util.Set;
import java.util.HashSet;

public class LearnHashSet {

	public static void main(String[] args) {

	// 1. Unordered
	// 2. No Duplicates
		
		// Hash Set declaration
		Set<Integer> hset = new HashSet<>();
		
		// Adding elements
		hset.add(15);
		hset.add(10);
		hset.add(2);
		hset.add(25);
		hset.add(12);
		
		System.out.println(hset);
		
		hset.add(25);
		hset.add(25);
		hset.add(12);
		hset.add(12);
		
		System.out.println(hset);
		
		System.out.println(hset.isEmpty()); // false
		
		System.out.println(hset.contains(25)); // true
		
		System.out.println(hset.contains(100)); // false
		
		hset.remove(10);
		
		System.out.println(hset);
		
		System.out.println(hset.size());
		
		hset.clear();
		
		System.out.println(hset.isEmpty()); // true
		
	}

}
