package com.demo.patterns;

import java.util.Scanner;

/**
 * Ninja has been given a task to print the required star pattern and he asked
 * your help for the same.
 * You must return an ‘N’*’N’ matrix corresponding to the given star pattern.
 * Example:
 * Input: ‘N’ = 4
 * Output:
 * * * * *
 * * ___ *
 * * ___ *
 * * * * *
 */

public class _21_BorderStar {
    public static void getStar(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n) {
                System.out.print("* ");
            } else {
                System.out.print("__");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        getStar(n);
        sc.close();
    }

}
