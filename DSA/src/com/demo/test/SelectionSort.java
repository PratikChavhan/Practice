package com.demo.test;

import java.util.Arrays;

public class SelectionSort {

	static int comparisions = 0; 
	static int iterations = 0;
	static int swapping = 0;
	public static void main(String[] args) {
		int[] arr = {12,5,68,32};
		
		System.out.print("Unsorted Array: ");
		System.out.println(Arrays.toString(arr));
		
		selectionsort(arr);
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("No of Iterations: " + iterations);
		System.out.println("No of Comparisions: " + comparisions);
		System.out.println("No of Swapping: " + swapping);
	}
	public static void selectionsort(int[] arr) {
		for(int i = 0; i < arr.length - 1 ; i++) {
			int min_index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min_index] ) { 
					min_index = j;
				}
				comparisions++;
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			swapping++;
			iterations++;
		}
	}

}
