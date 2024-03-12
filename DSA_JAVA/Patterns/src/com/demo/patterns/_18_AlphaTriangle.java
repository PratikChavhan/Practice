package com.demo.patterns;

import java.util.Scanner;

/**
 * Sam is researching on Alpha-Triangles. So, he needs to create them for
 * different integers ‘N’.
 * An Alpha-Triangle is represented by the triangular pattern of alphabets in
 * reverse order.
 * For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * C
 * C B
 * C B A
 */

public class _18_AlphaTriangle {
    public static void alphaTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 64 + n;
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char) num + " ");
                num--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        alphaTriangle(n);
        sc.close();
    }

}
