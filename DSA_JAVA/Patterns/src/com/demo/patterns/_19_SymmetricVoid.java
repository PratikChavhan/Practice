package com.demo.patterns;

import java.util.Scanner;

/**
 * Sam is curious about symmetric patterns, so he decided to create one.
 * For every value of ‘N’, return the symmetry as shown in the example.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * * * * * * *
 * * * ___ * *
 * * _______ *
 * * _______ *
 * * * ___ * *
 * * * * * * *
 */

public class _19_SymmetricVoid {
    public static void symmetry(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < 2 * i; k++) {
                System.out.print("  ");
            }
            for (int l = 0; l < n - i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int x = 0; x < n; x++) {
            for (int p = 0; p < x + 1; p++) {
                System.out.print("* ");
            }
            for (int q = 0; q < 2 * (n - x - 1); q++) {
                System.out.print("  ");
            }
            for (int r = 0; r < x + 1; r++) {
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
