package com.demo.set;

import java.util.TreeSet;
import java.util.Set;

public class LearnTreeSet {

	public static void main(String[] args) {
			// 1. Ordered
			// 2. No Duplicates
				
				// Linked Hash Set declaration
				Set<Integer> tset = new TreeSet<>();
				
				// Adding elements
				tset.add(15);
				tset.add(10);
				tset.add(2);
				tset.add(25);
				tset.add(12);
				
				System.out.println(tset);
				
				tset.add(25);
				tset.add(25);
				tset.add(12);
				tset.add(12);
				
				System.out.println(tset.isEmpty()); // false
				
				System.out.println(tset.contains(25)); // true
				
				System.out.println(tset.contains(100)); // false
				
				tset.remove(10);
				
				System.out.println(tset);
				
				System.out.println(tset.size());
				
				tset.clear();
				
				System.out.println(tset.isEmpty()); // true
					

	}

}
