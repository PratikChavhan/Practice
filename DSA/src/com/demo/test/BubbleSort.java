package com.demo.test;

import java.util.Arrays;

public class BubbleSort {

	static int comparisions = 0; 
	static int iterations = 0;
	static int swapping = 0;
	public static void main(String[] args) {
		int[] arr = {4,2,77,42};
		System.out.print("Unsorted Array: ");
		System.out.println(Arrays.toString(arr));
		
		bubblesort(arr);
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("No of Iterations: " + iterations);
		System.out.println("No of Comparisions: " + comparisions);
		System.out.println("No of Swapping: " + swapping);
	}
	public static void bubblesort(int[] arr) {
		for(int i = 0; i <= arr.length-1; i++) {
			boolean swap = false;
			iterations++;
			for(int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
					swapping++;
				}
				comparisions++;
			}
			System.out.println(Arrays.toString(arr));
			if (!swap) {
				break;
			}
		}
	}

}
