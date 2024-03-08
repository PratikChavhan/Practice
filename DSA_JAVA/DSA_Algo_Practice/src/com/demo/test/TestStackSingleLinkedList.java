package com.demo.test;

import com.demo.beans.StackSingleLinkedList;

public class TestStackSingleLinkedList {

	public static void main(String[] args) {
		StackSingleLinkedList s1 = new StackSingleLinkedList();
		
		System.out.println("isEmpty: " + s1.isEmpty());
		s1.push(10);
		s1.push(9);
		s1.push(8);
		s1.push(7);
		s1.push(6);
		s1.push(5);
		s1.display();
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		s1.display();
	}

}
