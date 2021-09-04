package main;

import main.*;

public class LinkedList{
	public Node head;
	
	public LinkedList(int data){
		Node a = new Node(data);
		this.head = a;
	}
	
	public void transversal(){
		Node temporaryNode = this.head;
		while(temporaryNode != null){
			System.out.println(temporaryNode.data);
			temporaryNode = temporaryNode.next;
		}
	}
	
	public void insertAtBegining(Node nodeName){
		nodeName.next = this.head;
		this.head = nodeName;
	}

	public void insertAtLast(Node nodeName){
		Node temporaryNode = this.head;
		while(temporaryNode != null)
			temporaryNode = temporaryNode.next;
		temporaryNode.next = nodeName;
	}

	public void insertNodeAfterNode(Node existentNodeName, Node nodeName){
		nodeName.next = existentNodeName.next;
		existentNodeName.next = nodeName;
	}

	public void deleteNode(Node nodeName){
		Node temporaryNode = this.head;
		if(nodeName == temporaryNode)
			this.head = nodeName.next;
		else{
			while(temporaryNode != null){
				if(temporaryNode == nodeName){
					temporaryNode = nodeName.next;
					break;
				}
				temporaryNode = temporaryNode.next;
			}	
		} 
	}
}