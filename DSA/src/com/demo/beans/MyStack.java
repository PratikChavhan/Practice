package com.demo.beans;

import java.util.Arrays;

public class MyStack {
	private int[] arr;
	private int size;
	private int top;
	
	public MyStack() {
		size = 10;
		arr = new int[size];
		top = -1;
	}
	
	// isFull
	public boolean isFull() {
		/*
		if(top == size-1) {
			System.out.println("Stack is full");
			return true;
		}
		else {
			return false;
		}*/
		return top == size - 1;
	}
	
	// isEmpty
	public boolean isEmpty() {
		/*if(top == -1) {
			System.out.println("Stack is Empty");
			return true;
		}
		else{
			return false;
		}*/
		return top == -1;
	}
	
	// push
	public void push(int n) {
		if(isFull()) {
			System.out.println("Stack Overflow");
		}
		else {
			top++;
			arr[top] = n;
		}
	}
	
	// pop
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		else {
			int num = arr[top];
			arr[top] = 0;
			top--;
			return num;
		}
	}
	
	// display
	public String toString() {
		return "Stack: "+Arrays.toString(arr) + ", Top: " + arr[top] + ", Top Index: " + top;		
	}
	
}
