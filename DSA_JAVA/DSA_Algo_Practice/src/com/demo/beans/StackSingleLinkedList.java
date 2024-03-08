package com.demo.beans;

public class StackSingleLinkedList {
	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Node top;
	public StackSingleLinkedList() {
		top = null;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return top == null;
	}
	
	// push
	public void push(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			top = newnode;
		}
		else {
			newnode.next = top;
			top = newnode;
		}
	}
	
	// pop
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		return temp.data;
	}
	
	// display 
	public void display() {
		Node temp = top;
		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp =temp.next;
		}
		System.out.println("]");
	}

}
