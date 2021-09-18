package main;

public final class DoublyLinkedList{
	public Node head;
	//public Node tail;

	public DoublyLinkedList(Node node){
		this.head = node;
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
		head.prev = node;
		head = node;
	}

	public void insertAtLast(Node node){
		Node temporaryNode = head;
		while(temporaryNode.next != null)
			temporaryNode = temporaryNode.next;
		temporaryNode.next = node;
		node.prev = temporaryNode;	
	}

	public void insertAtMiddle(Node existentNode, Node newNode){
		newNode.next = existentNode.next;
		//existentNode.next.prev = newNode; i don't know why this make null pointer exception
		existentNode.next = newNode;
		newNode.prev = existentNode;
	}

	public void deleteNode(Node existentNode){
		if(existentNode == head){
			head = head.next;		
			head.prev = null;
			return;
		}

		Node temporaryNode = head;	
		while(temporaryNode != null){
			if(temporaryNode.next == existentNode){
				temporaryNode.next = existentNode.next;
				existentNode.next.prev = temporaryNode; 
				break;
			}
			temporaryNode = temporaryNode.next;
		}
	}

}