package com.sai.programs.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		super();
		this.root = null;
	}
	
	public void insrtBST(int key) {

		Node tempRoot = root;
		root = insertBSTImpl(tempRoot, key);

	}
	

	
	private Node insertBSTImpl(Node temp, int key) {
		
		if(temp == null) {
			temp = new Node(key);

			return temp;
		}
		
		if(temp.value>key) {
			System.out.println("left" + temp.value);
			
			temp.left = insertBSTImpl(temp.left, key);
		}
		else if(temp.value<key){
			System.out.println("right" + temp.value);
			
			temp.right = insertBSTImpl(temp.right, key);
		}
		
		return temp;
		
	}

	
	public void insert(int val) {
		
		Node temp = new Node(val);
		
		if(this.root == null) {
			root = temp;
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		Node cur;
		while(!q.isEmpty()) {
			
			cur = q.peek();
			q.remove();
			
			if(cur.left == null) {
				cur.left = temp;
				break;
			}
			else {
				q.add(cur.left);
			}
			if(cur.right == null) {
				cur.right = temp;
				break;
			}
			else {
				q.add(cur.right);
			}
			
		}
		
		
	}
	
	public void inorder() {
		System.out.print("in order ==>");
		inorderImpl(root);
		System.out.println();
	}
	public void inorderImpl(Node temp) {
		
		if(temp == null) {
			return;
		}
		
		inorderImpl(temp.left);
		System.out.print(temp.value+ " ");
		inorderImpl(temp.right);
	}
	
	
	
	public void preOrder() {
		System.out.print("pre order ==>");
		preOrderimpl(root);
		System.out.println();
	}

	private void preOrderimpl(Node temp) {
		if(temp == null) {
			return;
		}
		
		System.out.print(temp.value + " ");
		preOrderimpl(temp.left);
		preOrderimpl(temp.right);
	}
	
	public void postOrder() {
		System.out.print("post order ==>");
		postOrderImpl(root);
		System.out.println();
	}

	private void postOrderImpl(Node temp) {
		if(temp == null) {
			return;
		}
		
		
		postOrderImpl(temp.left);
		postOrderImpl(temp.right);
		System.out.print(temp.value + " ");
		
	}
	
	
	
	
	
	
	
}



















