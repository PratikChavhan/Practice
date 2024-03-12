package com.demo.patterns;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of the pattern. For a given integer ‘N’,
 * they want to make the N-Binary Number Triangle.
 * You are required to print the pattern as shown in the examples below.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 0 1
 * 1 0 1
 */

public class _11_BinaryTriangle {
    public static void nBinaryTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                // if (i % 2 == 0) {
                // System.out.print((j + 1) % 2 + " ");
                // } else {
                // System.out.print(j % 2 + " ");
                // }
                System.out.print(i % 2 == 0 ? (j + 1) % 2 + " " : j % 2 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        nBinaryTriangle(n);
        sc.close();
    }

}
