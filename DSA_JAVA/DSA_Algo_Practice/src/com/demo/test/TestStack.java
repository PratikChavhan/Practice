package com.demo.test;
import com.demo.beans.MyStack;

public class TestStack {

	public static void main(String[] args) {
		MyStack s1 = new MyStack();
		System.out.println("Empty: " + s1.isEmpty());
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		s1.push(8);
		s1.push(9);
		s1.push(10);
		System.out.println(s1.toString());
		System.out.println("Full: " + s1.isFull());
		s1.pop();
		s1.pop();
		System.out.println(s1.toString());
	}

}
