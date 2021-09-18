package main;

public final class DoublyLinkedListMain{
	public static void main(String args[]){
		
		/*
		Node firstNode = new Node(25);
		DoublyLinkedList list = new DoublyLinkedList(firstNode);
		
		list.transversal();
		System.out.println("*************************");

		Node lastNode = new Node(999);
		list.insertAtLast(lastNode);
		list.transversal();
		System.out.println("*************************");

		Node middleNode = new Node(123456);
		list.insertAtMiddle(firstNode, middleNode);
		
		list.transversal();
		*/

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		DoublyLinkedList list = new DoublyLinkedList(node1);
		list.insertAtMiddle(node1, node2);
		list.insertAtMiddle(node2, node3);
		list.insertAtMiddle(node3, node4);
		list.insertAtMiddle(node4, node5);
		
		list.transversal();
		System.out.println("-- DELETING NODES IN LIST --");
		list.deleteNode(node1);

		list.transversal();

	}
}