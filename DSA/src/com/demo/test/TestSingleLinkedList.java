package com.demo.test;
import com.demo.beans.SinglyLinkedList; 

public class TestSingleLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		
		ll.printList();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addLast(6);
		ll.addLast(7);
		ll.printList();
		System.out.println(ll.getSize());
		ll.addFirst(2);
		ll.addFirst(1);
		ll.printList();
		ll.deleteLast();
		ll.deleteLast();
		ll.deleteLast();
		ll.printList();
		ll.deleteFirst();
		ll.deleteFirst();
		ll.printList();
		ll.addFirst(1);
		ll.printList();
		System.out.println(ll.getSize());
		ll.addByPosition(2, 2);
		ll.addByPosition(5, 5);
		ll.addByPosition(7, 7);
		ll.addByPosition(8, 8);
		ll.addByPosition(6, 6);
		ll.printList();
		System.out.println(ll.getSize());
		ll.deleteByPosition(1);
		System.out.println(ll.getSize());
		ll.printList();
		// ll.deleteByPosition(3);
		ll.deleteByValue(3);
		ll.printList();
	}

}
