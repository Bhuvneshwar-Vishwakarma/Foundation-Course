package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Print_Permutation_21 {
	 	public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        printPermutations(str, "");
	    }

	    public static void printPermutations(String ques, String asf) {
	        if(ques.length() == 0) {
	        	System.out.println(asf);
	        	return;
	        }
	    	for(int i = 0; i<ques.length(); i++) {
	    		char ch = ques.charAt(i);
	    		String lefts = ques.substring(0, i);
	    		String rights = ques.substring(i + 1);
	    		String roq = lefts + rights;
	    		
	    		printPermutations(roq, asf + ch);
	    	}
	    }
}
