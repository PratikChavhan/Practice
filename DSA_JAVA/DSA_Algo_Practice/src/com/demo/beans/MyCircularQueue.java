package com.demo.beans;

import java.util.Arrays;

public class MyCircularQueue {
	private int[] arr;
	private int size;
	private int front;
	private int rear;
	
	public MyCircularQueue() {
		size = 10;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	// isFull
	public boolean isFull() {
		if(front == -1 && rear == size -1) {
			return true;
		}
		else if (rear == front - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// isEmpty
	public boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true;
		}
		else
			return false;
	}
	
	
	// enqueue
	public void enqueue(int n) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			if (rear == -1) {
				rear = 0;
				arr[rear] = n;
			}
			else {
				rear++;
				rear = rear % size;
				arr[rear] = n;
			}
		}
	}
	
	// dequeue
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			if (front == -1) {
				front = 0;
				int n = arr[front];
				arr[front] = 0;
				front++;
				return n;
			}
			else {
				int n = arr[front];
				arr[front] = 0;
				front++;
				front = front % size;
				if(front == 0) {
					front = -1;
				}
				else if(rear == front -1) {
					front = -1;
					rear = -1;
				}
				return n;
			}
		}
	}
	
	// toString
	public String toString() {
		return Arrays.toString(arr) + ", front: " + front + ", rear: " + rear;
	}
	
}
