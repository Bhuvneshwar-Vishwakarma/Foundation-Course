package stack_And_Queue;
import java.io.*;
import java.util.*;

public class Infix_Conversion_9{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String> preFix = new Stack<>();
    Stack<String> postFix = new Stack<>();
    Stack<Character> oprtr = new Stack<>();
    
    for(int i = 0; i<exp.length(); i++) {
    	char ch = exp.charAt(i);
    	
    	if(ch == '(') {
    		oprtr.push(ch);
    	}else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
    		preFix.push(ch + "");
    		postFix.push(ch + "");
    	}else if(ch == ')') {
    		while(oprtr.peek() != '(') {
    			char op = oprtr.pop();
    			
    			String postv2 = postFix.pop();
    			String postv1 = postFix.pop();
    			String postv = postv1 + postv2 + op;
    			postFix.push(postv);
    			
    			String prev2 = preFix.pop();
    			String prev1 = preFix.pop();
    			String prev = op + prev1 + prev2;
    			preFix.push(prev);
    		}
    		oprtr.pop();
  
    	}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
    		while(oprtr.size() > 0 && oprtr.peek() != '(' && precedence(ch) <= precedence(oprtr.peek())) {
    			char op = oprtr.pop();
    			
    			String postv2 = postFix.pop();
    			String postv1 = postFix.pop();
    			String postv = postv1 + postv2 + op;
    			postFix.push(postv);
    			
    			String prev2 = preFix.pop();
    			String prev1 = preFix.pop();
    			String prev = op + prev1 + prev2;
    			preFix.push(prev);
    		}
    		oprtr.push(ch);
    	}
    }
    
    while(oprtr.size() > 0) {
		char op = oprtr.pop();
		
		String postv2 = postFix.pop();
		String postv1 = postFix.pop();
		String postv = postv1 + postv2 + op;
		postFix.push(postv);
		
		String prev2 = preFix.pop();
		String prev1 = preFix.pop();
		String prev = op + prev1 + prev2;
		preFix.push(prev);
	}
    System.out.println(postFix.pop());
    System.out.println(preFix.pop());
    
 }

	public static int precedence(char op) {
		if(op == '+' || op == '-') {
			return 1;
		}else if(op == '*' || op == '/') {
			return 2;
		}else {
			return 0;
		}
	}
}