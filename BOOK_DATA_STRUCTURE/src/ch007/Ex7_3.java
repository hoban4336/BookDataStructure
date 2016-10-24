package ch007;

public class Ex7_3 {

	public static void main(String[] args) {
		OptExp opt = new OptExp();
		
		String exp = "(3*5)-(6/2)";
		char postfix[] ;
		
		int value ;
		System.out.println(exp);
		
		if(opt.testpair(exp)){
			System.out.println("괄호 ok!");
		}else{
			System.out.println("괄호 틀림!");
		}
		
		System.out.println("\n 후위 표기식");
		postfix = opt.toPostfix(exp);
		System.out.println(postfix);
		
		
	}
}
