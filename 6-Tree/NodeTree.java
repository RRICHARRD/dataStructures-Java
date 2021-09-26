package main;

public final class NodeTree{
	public String data;
	public NodeTree parent;
	public NodeTree left;
	public NodeTree right;

	public NodeTree(String data){
		this.data = data;
		this.parent = null;
		this.right = null;
		this.left = null;
	}
}