package com.demo.test;

import com.demo.beans.MyQueue;

public class TestQueue {

	public static void main(String[] args) {
		MyQueue q1 = new MyQueue();
		
		System.out.println("Empty: " + q1.isEmpty());
		q1.dequeue();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		q1.enqueue(5);
		q1.enqueue(6);
		q1.enqueue(7);
		q1.enqueue(8);
		q1.enqueue(9);
		q1.enqueue(10);
		System.out.println("Full: "+ q1.isFull());
		System.out.println(q1.toString());
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		System.out.println(q1.toString());
		q1.dequeue();
		q1.dequeue();
		q1.dequeue();
		q1.enqueue(11);
		System.out.println(q1.toString());
		q1.dequeue();
		System.out.println(q1.toString());
		q1.dequeue();
		q1.dequeue();
	}

}
