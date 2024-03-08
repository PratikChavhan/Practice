package Basics.pattern;

import java.util.Scanner;

/**
 * Ninja was very fond of patterns. For a given integer ‘N’, he wants to make
 * the N-Star Rotated Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * *
 * * *
 * * * *
 * * *
 * *
 */

public class _10_RotatedTriangle {
    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int p = 0; p < i + 1; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int p = 0; p < (n - i) - 1; p++) {
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
