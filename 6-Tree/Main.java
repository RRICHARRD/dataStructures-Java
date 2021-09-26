package main;

import main.*;

public final class Main{
	public static void main(String args[]){
		NodeTree root = new NodeTree("RICHARD");		

		NodeTree secondTree = new NodeTree("SON OF RICHARD");
		
		secondTree.parent = root;

		root.left = new NodeTree("Left Leave - connected to root");
		root.right = new NodeTree("Right Leave - connected to root ");
		
		NodeTree thirdNode = new NodeTree("3");
		NodeTree fourthNode = new NodeTree("4");

		thirdNode.parent = secondTree;
		fourthNode.parent = thirdNode;
		
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		
		System.out.println(fourthNode.parent.parent.parent.data);
	}
}