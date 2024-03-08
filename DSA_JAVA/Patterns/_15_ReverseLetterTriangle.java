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

public class _15_ReverseLetterTriangle {
    public static void reverseLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 65;
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) num++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        reverseLetterTriangle(n);
        sc.close();
    }

}
