package com.demo.beans;

public class SinglyLinkedList {
	public class Node{
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}
	
	private int size; 
	Node head;
	public SinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	// Add at first
	public void addFirst(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	// Add at last
	public void addLast(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
		}
		else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newnode;
		}
	}
	
	// Add by Position
	public void addByPosition(int data, int pos) {
		Node newnode = new Node(data);
		if(head == null && pos != 1) {
			System.out.println("List Empty");
		}
		if(pos == 1) {
			if(head == null) {
				head = newnode;
			}
			else {
				newnode.next = head;
				head = newnode;
			}
		}
		else {
			Node prev = head;
			for(int i = 1;prev!= null && i <= pos - 2; i++) {
				prev = prev.next;
			}
			if(prev!=null) {
				newnode.next = prev.next;
				prev.next = newnode;
			}
			else {
				size--;
				System.out.println("Position is Wrong");
			}
		}
		
	}
	
	
	// Delete First
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List Empty");
		}
		else {
			size--;
			head = head.next;
		}
	}
	
	// Delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("List Empty");
		}
		else if(head.next == null) {
			size--;
			head = null;
		}
		else {
			size--;
			Node secondLast = head;
			Node lastNode = head.next;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
				secondLast = secondLast.next;
			}
			secondLast.next = null;
			
		}
	}
	
	// Delete by position
	public void deleteByPosition(int pos) {
		if(pos == 1) {
			head = head.next;
			return;
		}
		else {
			Node prev = head;
			Node current = head.next;
			for(int i = 1; current != null && i < pos - 2; i++) {
				prev = prev.next;
				current = current.next;
			}
			if(current!=null) {
				prev.next = current.next;
				// current.next =null;
				current = null;
			}
			else {
				System.out.println("Position is Wrong");
			}
		}
	}
	
	// Delete by value
	public void deleteByValue(int val) {
		if (head == null) {
			System.out.println("List is empty");
		}
		else {
			if (head.data == val) {
				head = head.next;
			}
			else {
				Node prevnode = head;
				Node newnode = prevnode.next;
				while( newnode!= null && newnode.data != val) {
					prevnode = prevnode.next;
					newnode = newnode.next;	
				}
				if(newnode != null) {
					Node temp = newnode.next;
					newnode = null;
					prevnode.next =temp;
				}
			}
		}
	}
	
	// get Size
	public int getSize() {
		return size;
	}
	
	// Display
		public void printList() {
			if(head == null) {
				System.out.println("List Empty");
			}
			else {
				Node currNode = head;
				System.out.print("[");
				while(currNode != null) {
					System.out.print(currNode.data + " -> ");
					currNode = currNode.next;
				}
				System.out.println("Null]");
			}
		}
}
