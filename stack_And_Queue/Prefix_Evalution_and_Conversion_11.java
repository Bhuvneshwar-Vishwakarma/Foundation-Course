 package stack_And_Queue;
import java.io.*;
import java.util.*;

public class Prefix_Evalution_and_Conversion_11{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> vs = new Stack<>();
    Stack<String> inFix = new Stack<>();
    Stack<String> postFix = new Stack<>();
    
    for(int i = exp.length() - 1; i>=0; i--) {
    	char ch = exp.charAt(i);
    	
    	if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
    		int v1 = vs.pop();
    		int v2 = vs.pop();
    		int val = operation(v1, v2, ch);
    		vs.push(val);
    		
    		String iv1 = inFix.pop();
    		String iv2 = inFix.pop();
    		String ival = "(" + iv1 + ch + iv2 + ")";
    		inFix.push(ival);
    		
    		String pv1 = postFix.pop();
    		String pv2 = postFix.pop();
    		String pval = pv1 + pv2 + ch;
    		postFix.push(pval);
    		
    	}else {
    		vs.push(ch - '0');
    		inFix.push(ch + "");
    		postFix.push(ch + "");
    	}
    }
    System.out.println(vs.pop());
    System.out.println(inFix.pop());
    System.out.println(postFix.pop());
    
 }

	public static int operation(int v1 , int v2 , char op) {
		if(op == '+') {
			return v1 + v2;
		}else if(op == '-') {
			return v1 - v2;
		}else if(op == '*') {
			return v1 * v2;
		}else {
			return v1 / v2;
		}
	}
}