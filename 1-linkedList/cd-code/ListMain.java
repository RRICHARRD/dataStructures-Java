package main;

import main.*;

public class ListMain{
	public static void main(String args[]){
		LinkedList myList = new LinkedList(25);
		
		myList.transversal();
		
		Node secondNode = new Node(66);
		myList.insertAtBegining(secondNode);
		myList.transversal();
	}
}