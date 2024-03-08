package Basics.pattern;

import java.util.Scanner;

/**
 * Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of
 * different sizes.
 * An Alpha-hill is represented by a triangle, where alphabets are filled in
 * palindromic order.
 * For every value of ‘N’, help sam to return the corresponding Alpha-Hill.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * ___ A
 * _ A B A
 * A B C B A
 */

public class _18_AlphaTriangle {
    public static void alphaTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int num = 64 + n;
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char) num + " ");
                num--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        alphaTriangle(n);
        sc.close();
    }

}
