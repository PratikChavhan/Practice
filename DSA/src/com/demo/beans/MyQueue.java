package com.demo.beans;

import java.util.Arrays;

public class MyQueue {

	private int[] arr;
	private int front;
	private int rear;
	private int size;
	
	public MyQueue() {
		size = 10;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	// isFull
	public boolean isFull() {
		return rear == size -1;
	}
	
	// isEmpty
	public boolean isEmpty() {
		if (rear == -1) {
			return true;
		}
		else if(front > rear) {
			return true;
		}
		else
			return false;
	}
	
	// enqueue
	public void enqueue(int n) {
		if (isFull()) {
			System.out.println("Queue is full");
		}
		else {
			rear++;
			arr[rear] = n;
		}
	}
	
	// dequeue
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			if (front == -1) {
				front++;
				int n = arr[front];
				arr[front] = 0;
				front++;
				return n;
			} else {
				//front++;
				int n = arr[front];
				arr[front] = 0;
				front++;
				return n;
			}
		}
	}
	
	// toString
	public String toString() {
		return Arrays.toString(arr) + ", front: " + front + ", rear: " + rear;
	}
}
