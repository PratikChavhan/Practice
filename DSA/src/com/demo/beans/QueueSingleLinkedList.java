package com.demo.beans;

public class QueueSingleLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	Node front;
	Node rear;
	public QueueSingleLinkedList() {
		front = null;
		rear = null;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return front == null && rear == null;
	}
	
	// enqueue
	public void enqueue(int data) {
		if (isEmpty()) {
			rear = new Node(data);
			front = rear;
		}
		else {
			Node newnode = new Node(data);
			rear.next = newnode;
			rear = newnode;
		}
	}
	
	// dequeue
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		Node temp = front;
		front = front.next;
		temp.next=null;
		return temp.data;
	}
	
	// display
	public void display() {
		Node temp = front;
		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp =temp.next;
		}
		System.out.println("]");
	}
}
