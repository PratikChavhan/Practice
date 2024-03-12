package com.demo.patterns;

import java.util.Scanner;

/**
 * Ninja was very fond of patterns. For a given integer ‘N’, he wants to make
 * the N-Star Reverse Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * * * * *
 * _* * *
 * ___*
 */

public class _8_ReverseStarTriangle {
    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int p = 0; p < 2 * (n - i) - 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        nStarTriangle(n);
        sc.close();
    }
}
