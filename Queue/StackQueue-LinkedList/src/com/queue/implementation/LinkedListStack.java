package com.queue.implementation;

public class LinkedListStack {
	
	public Node top;
	public int size;
	
	
	public LinkedListStack() {
		this.top = null;
	}
	
	public void push( int newValue) {
		
		Node temp = new Node(newValue);
		
		temp.next=top;
		
		top =temp;
		size++;
		
	}
	
	public void display() {
		
		Node temp = top;
		
		

		System.out.print("top ==>");
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public Node pop() {
		
		if(this.top==null) {
			return null;
		}
		
		Node temp = this.top;
		this.top = this.top.next;
		size--;
		return temp;
	}
	
	
	public Node Peek() {
		if(this.top!=null) {
			return this.top;
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
