package com.demo.test;

import java.util.Scanner;

public class StairCaseRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of Stairs: ");
		int n = sc.nextInt();
		System.out.println(findSteps(n));
		sc.close();
	}
	/*
	public static int findSteps(int n) {
		if (n == 0 )
			return 1;
		else if (n < 0) 
			return 0;
		else
			return findSteps(n -3) + findSteps(n -2) + findSteps(n -1);
	}*/
	
	public static int findSteps(int n) {
//		int cnt = 0;
//		int n1 = 1;
//		int n2 = 2;
//		int n3 = 3;
//		int sum = 0;
//		if (n == sum) {
//			cnt += 1;
			
//		}
		
		
		return n;
	}
}
