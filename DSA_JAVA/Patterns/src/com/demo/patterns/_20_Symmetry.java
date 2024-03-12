package com.demo.patterns;

import java.util.Scanner;

/**
 * Sam is curious about symmetric patterns, so he decided to create one.
 * For every value of ‘N’, return the symmetry as shown in the example.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * * _______ *
 * * * ___ * *
 * * * * * * *
 * * * ___ * *
 * * _______ *
 */

public class _20_Symmetry {
    public static void symmetry(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < 2 * (n - i - 1); k++) {
                System.out.print("  ");
            }
            for (int l = 0; l < i + 1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int x = 0; x < n; x++) {
            for (int p = 0; p < n - x - 1; p++) {
                System.out.print("* ");
            }
            for (int q = 0; q < 2 * (x + 1); q++) {
                System.out.print("  ");
            }
            for (int r = 0; r < n - x - 1; r++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        symmetry(n);
        sc.close();
    }

}
