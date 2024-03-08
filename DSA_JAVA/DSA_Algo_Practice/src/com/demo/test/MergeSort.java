package com.demo.test;

import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {65, 35, 25, 13, 23, 12, 91};
        System.out.print("Unsorted Array: ");
        System.out.println(Arrays.toString(arr));

        // mergeSort(array, start index, end index)
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("\nSorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, end, mid);
        }
    }

    public static void merge(int[] arr, int start, int end, int mid) {
        int i, j, k;
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(i = 0; i < n1; i++) {
            larr[i] = arr[start + i];
        }
        for(i = 0; i < n2; i++) { 
            rarr[i] = arr[mid+1+i];
        }

        i = 0; 
        j = 0; 
        k = start;
        while( i < n1 && j < n2) {
            if (larr[i] < rarr[j]) {
                arr[k] = larr[i];
                i++;
                k++;
            }
            else {
                arr[k] = rarr[j];
                j++;
                k++;
            }
        }
        while(i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}