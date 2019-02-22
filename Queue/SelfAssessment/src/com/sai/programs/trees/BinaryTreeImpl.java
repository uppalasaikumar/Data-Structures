package com.sai.programs.trees;

public class BinaryTreeImpl {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.insrtBST(10);
		tree.insrtBST(30);
		tree.insrtBST(50);
		tree.insrtBST(20);
		tree.insrtBST(40);
		tree.insrtBST(38);
		
		tree.inorder();
		tree.preOrder();
		tree.postOrder();
	}

}
