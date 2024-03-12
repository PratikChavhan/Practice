package com.demo.patterns;

import java.util.Scanner;

/**
 * Sam is making a Triangular painting for a maths project.
 * An N-dimensional Triangle is represented by the lower triangle of the pattern
 * filled with integers starting from 1.
 * For every value of ‘N’, help sam to print the corresponding N-dimensional
 * Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 1 2
 * 1 2 3
 */

public class _3_Triangle {

    public static void nTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 0;
            for (int j = 0; j < i + 1; j++) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        nTriangle(n);
        sc.close();
    }
}
