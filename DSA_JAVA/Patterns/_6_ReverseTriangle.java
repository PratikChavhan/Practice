package Basics.pattern;

import java.util.Scanner;

/**
 * Aryan and his friends are very fond of the pattern. For a given integer ‘N’,
 * they want to make the Reverse N-Number Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1 2 3
 * 1 2
 * 1
 */
public class _6_ReverseTriangle {
    public static void nNumberTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 0;
            for (int j = 0; j < n - i; j++) {
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
