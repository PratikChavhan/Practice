package com.demo.test;

import com.demo.beans.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		MyCircularQueue q1 = new MyCircularQueue();
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
		System.out.println(q1.toString());
		q1.enqueue(100);
		q1.enqueue(101);
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
		q1.enqueue(12);
		q1.enqueue(13);
		System.out.println(q1.toString());
		q1.dequeue();
		System.out.println(q1.toString());
		q1.dequeue();
		q1.dequeue();
		System.out.println(q1.toString());
		q1.dequeue();
		System.out.println(q1.toString());
		System.out.println("Empty: " + q1.isEmpty());
		System.out.println("Full: "+ q1.isFull());
		q1.enqueue(14);
		q1.enqueue(15);
		q1.enqueue(16);
		System.out.println(q1.toString());
	}

}
