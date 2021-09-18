package main;

public final class LinkedList{
	public Node head;

	public LinkedList(Node headerNode){
		head = headerNode;
	}

	public void transversal(){
		Node temporaryNode = head;
		while(temporaryNode != null){
			System.out.println(temporaryNode.data);
			temporaryNode = temporaryNode.next;
		}
	}

	public void insertAtBegin(Node node){
		node.next = head ;
		head = node;
	}

	/**
	* temporaryNode.next != null verifica se o nó atual aponta para um nó nullo
	* caso a resposta seja sim, esse apontamento que é nullo começa a apontar para
	* esse novo nó que está sendo inserido, super simples, lembra de pessoas se olhando.	
	*/
	public void insertAtLast(Node node){
		Node temporaryNode = head;
		while(temporaryNode.next != null)
			temporaryNode = temporaryNode.next;
		temporaryNode.next = node;
	}

	public void insertAtMiddle(Node existentNode, Node newNode){
		newNode.next = existentNode.next;
		existentNode.next = newNode;
	}
	
	public void deleteNode(Node existentNode){
		if(existentNode == head){
			head = head.next;
			existentNode.next = null;
			return;
		}
		
		Node temporaryNode = head;
		while(temporaryNode != null){
			if(temporaryNode.next == existentNode){
				temporaryNode.next = existentNode.next;
				existentNode.next = null;
				break;
			}
			temporaryNode = temporaryNode.next;
		}
	}
}