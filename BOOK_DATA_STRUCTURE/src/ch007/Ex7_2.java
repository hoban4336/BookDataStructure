package ch007;

public class Ex7_2 {

	public static void main(String[] args) {
		int stackSize =5;
		char deleteItem;
		LinkedStack s = new LinkedStack();
		
		s.push('a');
		s.printStack();
		
		s.push('b');
		s.printStack();
		
		s.push('c');
		s.printStack();
		
		System.out.println("peek: "+s.peek());
		System.out.println();
		System.out.println();
		
		deleteItem = s.pop();
		if(deleteItem !=0){
			System.out.println("delete item :" + deleteItem);
		}
		s.delete();
		
		
		s.printStack();
	}
}
