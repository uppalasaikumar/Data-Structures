package com.queue.implementation;

public class QueueImpl {

	public static void main(String[] args) {

		LinkedListQueue Queue = new LinkedListQueue();
		System.out.println("size is " + Queue.size);
		System.out.println("front is " + Queue.front);
		System.out.println("rear is "+ Queue.rear);
		Queue.display();
		
		System.out.println("Adding elements \n");
		Queue.enQueue(10);
		Queue.enQueue(20);
		Queue.enQueue(30);
		Queue.enQueue(40);
		Queue.display();
		
		System.out.println("front is " + Queue.front.value);
		System.out.println("rear is "+ Queue.rear.value);
		System.out.println("size is " + Queue.size);
		
		System.out.println(" \n removing elements \n");
		System.out.println("Dequeue value is "+Queue.deQueue().value);
		System.out.println("Dequeue value is "+Queue.deQueue().value);
		Queue.display();
		System.out.println("front is " + Queue.front.value);
		System.out.println("rear is "+ Queue.rear.value);
		System.out.println("size is " + Queue.size);
		

	}

}
