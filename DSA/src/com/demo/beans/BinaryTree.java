package com.demo.beans;

import java.util.*;

public class BinaryTree {
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
	public static class binaryTree {
		static int index = -1;
		public Node buildTree(int[] arr) {
			index++;
			if(arr[index] == -1) {
				return null;
			}
			Node newNode = new Node(arr[index]);
			
			// System.out.print(newNode.data + " ");
			
			newNode.left = buildTree(arr);
			newNode.right = buildTree(arr);
			return newNode;
		}
		// preOrder traversal
		public void preorder(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
		// inOrder traversal
		public void inorder(Node root) {
			if (root == null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
		// postOrder traversal
		public void postorder(Node root) {
			if (root == null) {
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
		// levelOrder traversal
		public void levelorder(Node root) {
			if (root == null) {
				return;
			}
			Queue<Node> q = new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node currNode = q.remove();
				if(currNode == null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else {
						q.add(null);
					}
				}
				else {
					System.out.print(currNode.data + " ");
					if(currNode.left != null) {
						q.add(currNode.left);
					}
					if (currNode.right != null) {
						q.add(currNode.right);
					}
				}
			}
		}
	}
}
