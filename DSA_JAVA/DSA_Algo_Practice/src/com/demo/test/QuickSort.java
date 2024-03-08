package com.demo.test;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {65,35,26,13,23,12,91};
        System.out.print("Unsorted array: ");
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.print("Quick Sorted Array: ");
		System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int start, int end) {
        if (start <  end) {
            int p = partition(arr, start, end);
            quickSort(arr, start, p-1);
            System.out.println(Arrays.toString(arr));
            quickSort(arr, p+1, end); 
            System.out.println(Arrays.toString(arr));
        }
    }
    public static int partition(int[] arr, int first, int last) {
        int pivot = first;
        int i = first;
        int j = last;

        while(i<j) {
            while (i < last && arr[i] <= arr[pivot]) {
                i++;
            }
            while (i > pivot && arr[j] > arr[pivot]) {
                j--;
            }
            if ( i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;
        System.out.println("i: "+i+", arr[i]: " + arr[i]);
        System.out.println("j: "+j+", arr[j]: " + arr[j]); 
        return j;
    }
}