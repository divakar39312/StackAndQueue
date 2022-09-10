package com.Bridgelabz;

public class LinkedList {

	Node head;
	Node tail;
	
	public void display() {
		
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("\n");
	}

	public void push(int data) {
		/**
		 * adding values
		 */
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void pop() {
		head = head.next;
	}

	public Object pop(int data) {
		/**
		 * finding second last node as temp and temp.next means the last node defined as
		 * null
		 * 
		 */
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node temp = head;
		while (temp.next.next != null)
			temp = temp.next;

		temp.next = null;

		return head;
	}
	
	public int size() {
		/**
		 * size of the stack
		 */
        Node temp=head;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

	class Node {
		int data;
		Node next;

		// COnstructors
		Node(int data) {
			this.data = data;
		}
	}
	public Node search(int data) {
		/**
		 * searching all data with value given
		 */
		Node temp = head;
		while (temp != null) {
			if (temp.data == data) {
				System.out.println(temp.data);
			}
			temp = temp.next;
		}
		return null;
	}
}