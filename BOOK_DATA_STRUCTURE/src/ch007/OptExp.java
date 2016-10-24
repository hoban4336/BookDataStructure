package ch007;

public class OptExp {
	private String exp;
	private int expSize;
	private char testch, openpair;

	public boolean testpair(String exp) {
		this.exp = exp;
		LinkedStack s = new LinkedStack();
		expSize = this.exp.length();
		for (int i = 0; i < expSize; i++) {
			testch = this.exp.charAt(i);
			switch (testch) {
			case '(':
			case '{':
			case '[':
				s.push(testch);
				break;
			case ')':
			case '}':
			case ']':
				if (s.isEmpty())
					return false;
				else {
					openpair = s.pop();
					if ((openpair == '(' && testch != ')')
							|| (openpair == '}' && testch != '}')
							|| (openpair == '[' && testch != ']')) {
						return false;
					} else {
						break;
					}
				}

			}

		}
		if (s.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public char[] toPostfix(String infix) {
		char testch;
		this.exp = infix;
		int expSize = 10;
		int j = 0;
		char postfix[] = new char[expSize];
		LinkedStack s = new LinkedStack();

		for (int i = 0; i <= expSize; i++) {
			testch = this.exp.charAt(i);
			switch (testch) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				postfix[j++] = testch;
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				s.push(testch);
				break;
			case ')':
				postfix[j++] = s.pop();
				break;

			default:
			}
		}
		postfix[j] = s.pop();
		return postfix;

	}

}
