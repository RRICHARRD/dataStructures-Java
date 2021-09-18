package main;

import main.*;

public final class CircularLinkedListMain{
	public static void main(String args[]){
		
		Node node1 = new Node(1);
		CircularLinkedList list = new CircularLinkedList(node1);
		

		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);	
		
		list.insertAtLast(node2);
		list.insertAtLast(node3);
		list.insertAtLast(node4);
		list.insertAtLast(node5);
		
		list.connectTailToNode();
		list.transversal();
	}
}