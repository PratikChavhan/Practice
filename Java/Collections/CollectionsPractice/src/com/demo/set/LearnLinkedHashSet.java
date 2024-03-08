package com.demo.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

	public static void main(String[] args) {

		// 1. Ordered
		// 2. No Duplicates
			
			// Linked Hash Set declaration
			Set<Integer> lhset = new LinkedHashSet<>();
			
			// Adding elements
			lhset.add(15);
			lhset.add(10);
			lhset.add(2);
			lhset.add(25);
			lhset.add(12);
			
			System.out.println(lhset);
			
			lhset.add(25);
			lhset.add(25);
			lhset.add(12);
			lhset.add(12);
			
			System.out.println(lhset.isEmpty()); // false
			
			System.out.println(lhset.contains(25)); // true
			
			System.out.println(lhset.contains(100)); // false
			
			lhset.remove(10);
			
			System.out.println(lhset);
			
			System.out.println(lhset.size());
			
			lhset.clear();
			
			System.out.println(lhset.isEmpty()); // true
			
			
		}
}
