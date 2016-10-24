package ch007_1;

class StackNod{
	int data;	
	StackNod link;
}

class Linkedstack{
	private StackNod top;
		
	public boolean isEmpty(){
		return (top == null);
	}
	
	public void push(int item){
		StackNod newNode = new StackNod();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("push: "+ item);
	}
	
	public int pop(){
		if(isEmpty()) {
			System.out.println("Deleting fail! Linked Stack is empty!!");
			return 0;
		}
		else{ 
			int item = top.data;
			top = top.link;
			System.out.println("pop: "+item);
			return item;	
		}				
	}	
}

class OptExp2{	
	private String exp;
	
	public int evalPostfix(String postfix){		
		Linkedstack S = new Linkedstack();
		exp = postfix;
		int opr1, opr2, value;			
	    char testCh;
		for(int i=0; i<7; i++){		
			testCh = exp.charAt(i);
			if(testCh != '+' && testCh != '-' && testCh != '*' && testCh != '/'){
				value = testCh - '0';
				S.push(value);
			}
			else{
				opr2 = S.pop();
				opr1 = S.pop();
				switch(testCh){
					case '+' : S.push(opr1 + opr2); break;
					case '-' : S.push(opr1 - opr2); break;
					case '*' : S.push(opr1 * opr2); break;
					case '/' : S.push(opr1 / opr2); break;
				}
			}			
		}
		return S.pop();		
	}	

}

class Ex7_4{
	public static void main(String args[]){
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";	
		System.out.println(exp);
		result = opt.evalPostfix(exp);
		System.out.println(result);		
	}
}