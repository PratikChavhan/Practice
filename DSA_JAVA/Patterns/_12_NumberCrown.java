package Basics.pattern;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of the pattern. They want to make the
 * Reverse N-Number Crown for a given integer' N'.
 * Given 'N', print the corresponding pattern.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1 _______ 1
 * 1 2 ___ 2 1
 * 1 2 3 3 2 1
 */

public class _12_NumberCrown {
    public static void numberCrown(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int p = 0; p < 2 * (n - i) - 2; p++) {
                System.out.print("  ");
            }
            for (int q = i + 1; q > 0; q--) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        numberCrown(n);
        sc.close();
    }

}
