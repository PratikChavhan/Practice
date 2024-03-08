package com.demo.beans;

import com.demo.beans.BinaryTree.Node;

public class BinarySearchTree {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	// insert 
	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		if (root.data > val) {
			// left subtree
			root.left = insert(root.left, val);
		}
		if (root.data < val) {
			// right subtree
			root.right = insert(root.right, val);
		}
		return root;
	}
	
	// preOrder 
	public void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root + " ");
		inorder(root.right);
	}
	
}
