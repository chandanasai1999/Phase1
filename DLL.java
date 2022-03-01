package com.oops.prgms;
public class DLL {
	Node head;

	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	// insert node at first position
	public void push(int new_data) {
		Node new_Node = new Node(new_data);
		new_Node.next = head;
		new_Node.prev = null;
		if (head != null) //insert node at first position when list is not empty
			head.prev = new_Node;
		head = new_Node; // insert when the list is empty
	}
	//insert node after a perticular node
	public void InsertAfter(Node prev_Node, int new_data) {
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_Node.next;
		prev_Node.next = new_node;
		new_node.prev = prev_Node;
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}
	//add new node at the end of the list
	void append(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		
		Node last = head;
		
		//if list is empty
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}
}


