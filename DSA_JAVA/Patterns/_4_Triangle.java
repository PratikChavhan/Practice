package Basics.pattern;

import java.util.Scanner;

/**
 * Sam is making a Triangular painting for a maths project.
 * An N-dimensional Triangle is represented by the lower triangle of the pattern
 * filled with integers representing the row number.
 * For every value of ‘N’, help sam to print the corresponding Triangle.
 * Example:
 * Input: ‘N’ = 3
 * Output:
 * 1
 * 2 2
 * 3 3 3
 */

public class _4_Triangle {

    public static void nTriangle(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        nTriangle(n);
        sc.close();
    }
}
