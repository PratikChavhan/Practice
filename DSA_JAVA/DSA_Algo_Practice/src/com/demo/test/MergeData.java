package com.demo.test;

import java.util.Arrays;

public class MergeData {

	public static void main(String[] args) {
		int[] arr1 = {3, 8, 11, 25, 30, 51};
		int[] arr2 = {1, 2, 5, 17};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		System.out.println("Sorted Array 1: " + Arrays.toString(arr1));
		System.out.println("Sorted Array 2: " + Arrays.toString(arr2));
		
		merge(arr1, arr2, arr3);
		System.out.println("Sorted Array Merged: " + Arrays.toString(arr3));
	}
	public static void merge(int[] arr1, int[] arr2, int[] arr3) {
		int i=0, j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
			if (arr1[i]<arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i < arr1.length) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while(j < arr2.length) {
			arr3[k] = arr1[j];
			k++;
			j++;
		}
	}

}
