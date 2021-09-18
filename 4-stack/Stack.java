package main;

public final class Stack{
	
	private int size;
	private int top = 0;	
	private int[] stack = null;	

	public Stack(int size){
		this.size = size;
		stack = new int[size+1];
	}

	private boolean whenEmpty(){
		System.out.println("Unfortunately, the stack is totally empty !!!");
		return true;
	}

	public boolean isEmpty(){
		if(this.top == 0)
			return whenEmpty();
		return true;
	}
		
	private boolean whenFull(){
		System.out.println("Unfortunately, the stack is totally full !!!");
		return true;
	}

	public boolean isFull(){
		if(this.top == this.size)
			return whenFull();
		return false;			
	}

	private boolean whenStackOverFlow(){
		System.out.println("you can't add new element at the top of stack because it is full !!!");
		this.top = this.top-1;
		return false;
	}

	public boolean push(int number){
		this.top += 1;
		if(this.top > this.size)
			return whenStackOverFlow();
		stack[this.top] = number;
		return true;		
	}

	public boolean pop(){
		if(this.top == 0){
			whenEmpty();
			return false;
		}
		this.top = this.top-1;
		return true;
	}

	public void showStack(){
		for(int i=1; i<=top; i++)
			System.out.println(stack[i]);	
	}

	public void peek(){
		System.out.println(stack[this.top]);
	}
}