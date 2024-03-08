package com.demo.test;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {12,5,68,32};
		
		System.out.print("Unsorted Array: ");
		System.out.println(Arrays.toString(arr));
		
		insertionSort(arr);
		System.out.print("Sorted Array: ");
		System.out.println(Arrays.toString(arr));

	}
	public static void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			for(; j>=0 && arr[j] > key; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
	}

}
