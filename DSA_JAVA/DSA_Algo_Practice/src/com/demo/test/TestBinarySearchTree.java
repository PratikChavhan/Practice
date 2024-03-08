package com.demo.test;

import com.demo.beans.BinaryTree.*;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		int[] values = {5, 1, 3, 4, 2, 7};
		Node root = null;
		for(int i = 0; i < values.length; i++) {
			root = insert(root, values[i]);
		}
		inorder(root);
		System.out.println();
	}

}
