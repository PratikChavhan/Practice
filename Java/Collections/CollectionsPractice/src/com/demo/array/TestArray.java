package com.demo.array;

// CRUD Operations of Array List

import java.util.ArrayList;
import java.util.Iterator;

public class TestArray {
	
	public static void main(String[] args) {
	
	// Declaring array of String
		ArrayList<String> studentsName = new ArrayList<>();
		
		
	// Adding elements
		studentsName.add("Pratik");
		studentsName.add("Somesh");
		studentsName.add("Ankit");
		studentsName.add("Anurag");
		// System.out.println(studentsName);
		
		
	// Declaring Array of Integer
		ArrayList<Integer> intarr = new ArrayList<>();
		
		
	// Adding elements 
		intarr.add(1);
		intarr.add(2);
		intarr.add(3);
		intarr.add(4);
		// System.out.println(intarr);
		
		
	// adding elements at specific index
		intarr.add(0, 100);
		intarr.add(1, 200);
		// System.out.println(intarr);
		
		
	//	reading data at specific index 
		// System.out.println(intarr.get(1));
		
	
	// updating data at specific index
		intarr.set(2, 300);
		// System.out.println(intarr);
		
		
	// remove element in list
		// by index
		intarr.remove(2);
		// System.out.println(intarr);
		
		// by value
		intarr.remove(Integer.valueOf(100));
		// System.out.println(intarr);
				
		
	// clear all data inside list
		intarr.clear();
		// System.out.println(intarr);
	
		
	// check list contains given element
		// System.out.println(studentsName.contains("Pratik"));
		// System.out.println(studentsName.contains("Atharva"));
	
		
	// print array list in separate line
		// normal for loop
		for(int i = 0; i<studentsName.size(); i++) {
			// System.out.println(studentsName.get(i));
		}
		
		// foreach
		for(String ele: studentsName) {
			// System.out.println("foreach: "+ele);
		}
		
		// iterator
		Iterator<String> itr = studentsName.iterator();
		while (itr.hasNext()) {
			// System.out.println("Iterator: " + itr.next());
		}
		
	}
}