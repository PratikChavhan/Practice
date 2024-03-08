package Basics.pattern;

import java.util.Scanner;

/**
 * Sam is curious about Alpha-Ramp, so he decided to create Alpha-Ramp of
 * different sizes.
 * An Alpha-Ramp is represented by a triangle, where alphabets are filled from
 * the top in order.
 * For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * A
 * B B
 * C C C
 */

public class _16_AlphaRamp {
    public static void alphaRamp(int n) {
        for (int i = 65; i < 65 + n; i++) {
            for (int j = 0; j < i - 65 + 1; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        alphaRamp(n);
        sc.close();
    }

}
