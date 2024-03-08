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

public class _17_AlphaHill {
    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i) - 2; j++) {
                System.out.print(" ");
            }
            int p = 65;
            for (p = 65; p < i + 1 + 65; p++) {
                System.out.print((char) p + " ");
            }
            p = 65 + i - 1;
            for (int q = 0; q < i; q++) {
                System.out.print((char) p-- + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        alphaHill(n);
        sc.close();
    }

}
