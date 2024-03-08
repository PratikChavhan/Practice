package com.demo.test;

import com.demo.beans.BinaryTree.*;

public class TestBinaryTree {

	public static void main(String[] args) {
		int[] arr = {1, 2, 4, -1, -1, 5, -1 , -1, 3, -1, 6, -1, -1};
		binaryTree tree = new binaryTree();
		Node root = tree.buildTree(arr);
		
		System.out.println("PreOrder Traversal");
		tree.preorder(root);
		System.out.println();
		
		System.out.println("InOrder Traversal");
		tree.inorder(root);
		
		System.out.println();
		System.out.println("PostOrder Traversal");
		tree.postorder(root);
		
		System.out.println();
		System.out.println("Level Order Traversal");
		tree.levelorder(root);
	}

}
