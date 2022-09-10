package com.Bridgelabz;

public class Stack {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		System.out.println("Node size is  " + list.size()+"\n");
		System.out.println("Before pop ");
		list.display();
		System.out.println("popping elements ");
		while (list.size() != 0) {
			list.pop();
			list.display();
		}
		System.out.println("After pop ");
		list.display();
		System.out.println("\n<<<<<list is empty>>>>>");
	}
}
