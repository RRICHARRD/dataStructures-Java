package main;

import main.*;

public final class Main{
	public static void main(String args[]){
		
		Stack stack = new Stack(3);
		
		stack.push(150);
		stack.push(255);
		stack.push(399);
		stack.showStack();	
		
		stack.push(777);		

		stack.peek();

		System.out.println("--- POPING TWO ELEMENTS FROM MY STACK ---");
		stack.pop();
		stack.pop();
		
		stack.showStack();
	}
}