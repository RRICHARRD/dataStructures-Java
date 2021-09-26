package main;

import main.*;

public final class Main{
	public static void main(String args[]){
		Queue queue = new Queue(3);
		
		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 30;
		int numberFour = 40;
	
		queue.enqueue(numberOne);
		queue.enqueue(numberTwo);
		queue.enqueue(numberThree);
		queue.enqueue(numberFour);
		
		queue.showElements();
		System.out.println("-------------------------");

		queue.peek();
		
		System.out.println("Dequeueing the three that have been inserted in the queue and use the method for the fourth time");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		queue.showElements();		
	}
}