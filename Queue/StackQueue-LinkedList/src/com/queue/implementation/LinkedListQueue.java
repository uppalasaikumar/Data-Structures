package com.queue.implementation;

public class LinkedListQueue {
	
	public Node front;
	public Node rear;
	public int size;
	
	public LinkedListQueue() {
		this.front = this.rear = null;
	}
	
	public void enQueue(int newValue) {
		
		Node temp = new Node(newValue);
		
		if(this.rear == null) {
			this.front = this.rear = temp;
			size++;
			return;
		}
		
		this.rear.next = temp;
		this.rear = temp;
		size++;
		
	}
	
	
	public Node deQueue() {
		
		if(this.front == null) {
			return null;
		}
		Node temp ;
		temp = this.front;
		this.front = this.front.next;
		size--;
		
		if(this.front == null) {
			this.rear = null;
		}
		
		
		return temp;
	}
	
	
	public void display() {
		
		System.out.print("front -> ");
		
		Node trav = this.front;
		
		while(trav!=null) {
			System.out.print(trav.value + " ");
			trav = trav.next;
		}
		
		System.out.print(" <- rear");
		System.out.println();
	}
}





















































