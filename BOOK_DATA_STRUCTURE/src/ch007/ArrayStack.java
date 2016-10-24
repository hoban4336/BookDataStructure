package ch007;

public class ArrayStack implements Stack{

	private int top;
	private int stackSize;
	private char itemArray[];
	
	public ArrayStack(int stackSize) {
		top =-1;
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	
	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public boolean isFull() {
		return (top==(stackSize-1));
	}
	
	@Override
	public void push(char item) {
		if(isFull()){
			System.out.println("i'm full");
		}else{
			itemArray[++top] = item;
			System.out.println("inserted item:" + itemArray[top]);
		}
	}

	@Override
	public char pop() {
		if(isEmpty()){
			System.out.println("nothing");
			return 0;
		}else{
			return itemArray[top--];
		}
	}

	@Override
	public void delete() {
		if(isEmpty()){
			System.out.println("nothing");
		}else{
			top--;
		}
	}

	@Override
	public char peek() {
		if(isEmpty()){
			System.out.println("nothing");
			return 0;
		}else{
			return itemArray[top];
		}
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.println("nothing!");
		}else{
			System.out.println("===Array Stack===");
			for(int i=0; i <=top; i++){
				System.out.println(itemArray[i]);
			}
			System.out.println();
			System.out.println();
			
		}
	}


}
