package stack_And_Queue;
import java.io.*;
import java.util.*;
//https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/infix-evaluation-official/ojquestion
public class Infix_Evaluation_8{

	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();
		
		Stack<Integer> oprand = new Stack<>();
		Stack<Character> oprator = new Stack<>();
		
		for(int i = 0; i<exp.length(); i++) {
			char ch = exp.charAt(i);
			
			if(ch == '(') {
				oprator.push(ch);
			}else if(Character.isDigit(ch)) {
				oprand.push(ch - '0');
			}else if(ch == ')') {
				while(oprator.peek() != '(') {
					char optor = oprator.pop();
					int v2 = oprand.pop();
					int v1 = oprand.pop();
					
					int opv = operation(v1, v2, optor);
					oprand.push(opv);
				}
				oprator.pop();
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				// ch is wanting higher priority operator to solve first
				while(oprator.size() > 0 && oprator.peek() != '(' &&
						precedence(ch) <= precedence(oprator.peek())) {
					char optor = oprator.pop();
					int v2 = oprand.pop();
					int v1 = oprand.pop();
					
					int opv = operation(v1, v2, optor);
					oprand.push(opv);
				}
				//ch is putting itself now
				oprator.push(ch);
			}
		}
		
		while(oprator.size() != 0) {
			char optor = oprator.pop();
			int v2 = oprand.pop();
			int v1 = oprand.pop();
			
			int opv = operation(v1, v2, optor);
			oprand.push(opv);
		}
		System.out.println(oprand.peek());
		
	}

	public static int precedence(char optr) {
		if(optr == '+') {
			return 1;
		}else if(optr == '-') {
			return 1;
		}else if(optr == '*') {
			return 2;
		}else {
			return 2;
		}
	}
	public static int operation(int val1, int val2, char optr) {
		if(optr == '+') {
			return val1 + val2;
		}else if(optr == '-') {
			return val1 - val2;
		}else if(optr == '*') {
			return val1 * val2;
		}else {
			return val1 / val2;
		}
	}
}
		
		