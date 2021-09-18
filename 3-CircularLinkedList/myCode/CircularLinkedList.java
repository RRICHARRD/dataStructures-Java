package main;

import main.*;

public final class CircularLinkedList{
	public Node head;

	public CircularLinkedList(Node node){
		head = node;
	}

	public void transversal(){
		Node temporaryNode = head;
		while(temporaryNode != null){
			System.out.println(temporaryNode.data);
			temporaryNode = temporaryNode.next;
		}
	}
	
	public void insertAtBegin(Node node){
		node.next = head;
		head = node;
	}

	public void insertAtMiddle(Node existentNode, Node newNode){
		newNode.next = existentNode.next;
		existentNode.next = newNode;	
	}

	public void insertAtLast(Node node){
		Node temporaryNode = head;
		while(temporaryNode.next != null)
			temporaryNode = temporaryNode.next;
		temporaryNode.next = node;
	}

	public void connectTailToNode(){
		Node temporaryNode = head;
		while(temporaryNode.next != null)
			temporaryNode = temporaryNode.next;
		temporaryNode.next = head;
	}
}