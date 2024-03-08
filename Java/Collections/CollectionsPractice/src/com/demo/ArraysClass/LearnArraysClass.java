package com.demo.ArraysClass;

import java.util.Arrays;

public class LearnArraysClass {

	public static void main(String[] args) {
		// int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// int index = Arrays.binarySearch(number, 6);
		
		// System.out.println("The element 6 is at index " + index);
		
		int[] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79};
		
		for(int x: numbers) {
			System.out.print(x+" ");
		}
				
		System.out.println("length of array: " + numbers.length);
		
		Arrays.sort(numbers);
		
		for(int x: numbers) {
			System.out.print(x+" ");
		}
		
		
		Arrays.fill(numbers, 12);
		
		for(int x: numbers) {
			System.out.print(x+" ");
		}
	}

}
