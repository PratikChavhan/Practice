package com.demo.test;

public class BinarySearchRecursion {

	static int comparision = 0;
	public static void main(String[] args) {
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		int index = binarySearchRecursive(0, arr.length, 22, arr);
		if (index == -1)
			System.out.println("Key not found");
		else
			System.out.println("Key found at index: " + index);
		System.out.println("No of comparision: " + comparision);
	}
	public static int binarySearchRecursive(int first, int last, int search, int arr[]) {
		if (first > last) 
			return -1;
		else{
			int mid = (first + last) / 2;
			comparision++;
			if (arr[mid] == search){	
				return mid;
			}
			else if (arr[mid] < search)
				return binarySearchRecursive(mid + 1, last, search, arr);
			else
				return binarySearchRecursive(first, mid - 1, search, arr);
		}
	}

}
