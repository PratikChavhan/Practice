package com.demo.set;

import java.util.HashSet;
import java.util.Set;

public class SetObjectDuplicationHandle {

	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student("Anuj", 10));
		studentSet.add(new Student("Pratik", 11));
		studentSet.add(new Student("Somesh", 10));
		studentSet.add(new Student("Anurag", 12));
		studentSet.add(new Student("Anurag", 12));
		
		System.out.println(studentSet);

	}

}
