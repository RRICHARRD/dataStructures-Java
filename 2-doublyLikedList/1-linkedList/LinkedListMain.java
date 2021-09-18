package main;

import main.*;

public final class LinkedListMain{
	public static void main(String args[]){	
		

		/*
		Node firstNode = new Node(125);	
		LinkedList list = new LinkedList(firstNode);
		
		list.transversal();
		System.out.println("------------------------");
		
		Node lastNode = new Node(99);
		list.insertAtLast(lastNode);
		list.transversal();
	
		System.out.println("------------------------");
		Node middleNode = new Node(888);
		list.insertAtMiddle(firstNode, middleNode);
		list.transversal();
		*/

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
	
		LinkedList list = new LinkedList(node1);
		list.insertAtMiddle(node1, node2);
		list.insertAtMiddle(node2, node3);
		list.insertAtMiddle(node3, node4);
		list.insertAtMiddle(node4, node5);
		list.insertAtMiddle(node5, node6);
		list.insertAtMiddle(node6, node7);
		
		list.transversal();

		System.out.println("--- DELETING NUMBER FOUR AT LINKED LIST ---");
		list.deleteNode(node4);
		list.transversal();		
	}
}