package com.queue.implementation;

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
	
	public void insertAfter(int afterValue,int newValue) {
		Node temp = new Node(newValue);
		
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		
		Node cur = this.head;
		Node to = null;
		while(cur!=null) {
			if(cur.value == afterValue) {
				to = cur;
				break;
			}
			cur=cur.next;
		}
		
		if(to == null) {
			System.out.println("element not found");
			return;
		}
		
		temp.next = to.next;
		to.next = temp;
		size++;
		System.out.println("value inserted after "+ afterValue);
		
		
	}
	
	public void append(int newValue) {
		
		Node temp = new Node(newValue);
		
		Node cur = this.head;
		while(cur.next!=null) {
			cur=cur.next;
		}
		
		cur.next = temp;
		size++;
	}
	
	
	
	public void delete(int val) {
		Node cur = this.head;
		Node prev = null;
		
		if(this.head.value == val) {
			this.head = this.head.next;
			size--;
			return;
		}
		
		while(cur!=null) {
			if(cur.value==val) {
				prev.next=cur.next;
				size--;
				return;
			}
			prev=cur;
			cur=cur.next;
		}
		//need to delete cur
		System.out.println("no element found with value "+ val);
		
		
	}
	
	public void deleteAtPos(int pos) {

		if(pos>size) {
			System.out.println("no element at that position");
			return;
		}
		
		if(pos==0) {
			this.head=this.head.next;
			size--;
			return;
		}
		
		int count = 0;
		Node temp = this.head;
		Node prev = null;
		while(count!=pos) {
			prev = temp;
			temp=temp.next;
			count++;
		}
		prev.next = temp.next;
		size--;
		
	
	}
	
	public void reverse() {
		
		Node temp = null; 
		Node temp1 = null; 
		Node oldHead = head;
		temp=head.next;
		
		while(temp!=null) {
			
			temp1 = temp.next;
			temp.next=head;
			head=temp;
			temp=temp1;
			
		}
		oldHead.next=null;
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
