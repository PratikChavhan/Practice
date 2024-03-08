package com.demo.test;

import com.demo.beans.QueueSingleLinkedList;

public class TestQueueSingleLinkedList {

	public static void main(String[] args) {
		QueueSingleLinkedList q1 = new QueueSingleLinkedList();
		
		System.out.println(q1.isEmpty());
		q1.enqueue(10);
		q1.enqueue(9);
		q1.enqueue(8);
		q1.enqueue(7);
		q1.enqueue(6);
		q1.enqueue(5);
		q1.display();
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		q1.display();
		
	}

}
