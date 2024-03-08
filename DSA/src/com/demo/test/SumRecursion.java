package com.demo.test;

import java.util.Scanner;

public class SumRecursion {

	static int add = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		
		int addition = sum1(n);
		System.out.println("Sum of first " + n + " natural numbers : " + addition);
	}
//	public static int sum1(int n) {
//		if (n>0) {
//			add += n;
//			n--;
//			return sum1(n);
//		}
//		else
//			return add;
//	}
	
	public static int sum1(int n) {
		if (n <= 0) {
			return n; 
		}
		return n+sum1(n-1);
	}
}
