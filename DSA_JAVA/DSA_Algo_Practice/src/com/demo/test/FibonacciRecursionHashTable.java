package com.demo.test;

import java.util.Hashtable;

public class FibonacciRecursionHashTable {
	
	    static Hashtable<Integer, Integer> memo = new Hashtable<>();

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        if (memo.containsKey(n)) {
	            return memo.get(n);
	        }
	        int result = fibonacci(n - 1) + fibonacci(n - 2);
	        memo.put(n, result);
	        return result;
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

}
