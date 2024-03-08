package Basics.pattern;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of patterns. For a given integer ‘N’,
 * they want to make the Increasing Number Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 2 3
 * 4 5 6
 */

public class _13_IncreasingNumberTriangle {
    public static void nNumberTriangle(int n) {
        int num = 0;
        for (int i = 0; i < n; i++) {
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
        nNumberTriangle(n);
        sc.close();
    }

}
