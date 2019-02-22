package com.sai.programs;

public class LinkedList {

	public Node head;
	public int size;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void insert(int newValue) {
		
		Node temp = new Node(newValue);
		
		if(head == null) {
			head = temp;
			size++;
			return;
		}
		
		Node cur = head;
		Node last ;
		while(cur.next!=null) {
			cur = cur.next;
		}
		last = cur;
		last.next = temp;
		size++;
	}
	
	public void middleNode() {
		
		Node cur = head;
		Node mid =head;
		int count=-1;
		while(cur.next!=null) {
			if(count%2 == 0) {
				mid = mid.next;
			}
			cur=cur.next;
			count++;
		}
		
		System.out.println("middle node is "+mid.value);
		
	}
	
	
	public void display() {
		
		System.out.print("Head ==>");
		
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
