package main;

public final class Queue{
	public int size;
	public int[] queue;
	public int head;
	public int tail;

	public Queue(int size){
		this.queue = new int[size];
		this.head = -1;
		this.tail = -1;
	}

	public boolean isEmpty(){
		if(this.head == -1 && this.tail == -1)
			return true;
		return false;
	}

	public boolean isFull(){
		if(this.tail == queue.length && this.head == queue.length)	
			return true;
		return false;
	}

	private boolean verificationTailExceedSize(){
		if(this.tail > queue.length)	
			return true;
		return false;
	}

	public void enqueue(int element){
		if(isFull())
			System.out.println("Impossible to enqueue something, because the queue is totally full");
		else if(isEmpty()){
				this.head = this.tail += 1;
				queue[this.tail] = element;
		} else {			
			this.tail += 1;
			if(verificationTailExceedSize())
				this.tail -= 1; 
			else 
				queue[this.tail] = element;
		}			
	}

	private boolean queueTotallyDequeued(){
		if(this.head == queue.length)
			return true;
		return false;
	}

	public void dequeue(){
		if(isEmpty())
			System.out.println("Does not have anything to be dequeued in this queue, please, insert something to them before remove");
		else if(queueTotallyDequeued()){ 
			System.out.println("This is a limitation of basic queue data structure, all the position has been dequeued, use circular queue to fix this problem or create a new queue to insert new elements and dequeue again and again");
		} else
			this.head += 1;
	}

	public void showElements(){
		for(int i=head; i<queue.length; i++)
			System.out.println(queue[i]);
	}

	public void peek(){
		System.out.println(queue[head]);
	}
}