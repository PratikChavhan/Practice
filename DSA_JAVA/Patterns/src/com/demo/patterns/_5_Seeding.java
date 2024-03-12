package com.demo.patterns;

import java.util.Scanner;

/**
 * Sam is planting trees on the upper half region (separated by the left
 * diagonal) of the square shared field.
 * For every value of ‘N’, print the field if the trees are represented by ‘*’.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * * * *
 * * *
 * *
 */

public class _5_Seeding {

    public static void seeding(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
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
        seeding(n);
        sc.close();
    }
}
