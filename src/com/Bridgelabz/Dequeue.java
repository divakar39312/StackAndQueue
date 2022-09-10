package com.Bridgelabz;

public class Dequeue {
	
	public static void main(String[] args) {
		// Object of LinkedList class
		LinkedList list = new LinkedList();
		// calling methods for Enqueue operation
		list.append(56); // here push performs enqueue operation
		list.append(30);
		list.append(70);
		list.display();
		System.out.println("Node size is " +list.size());
		// Dequeue Operation
		System.out.println("\nDequeue Operation");
		   while(list.size() != 0){
		       list.pop();
			   list.display();
		   }
		   System.out.println("\nThe Stack is empty....");
	}
}