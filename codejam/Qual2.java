package codejam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Qual2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  System.out.println("Enter no. of test cases");
	      int t = Integer.parseInt(br.readLine());
	      int d = 1;
	      while(d <= t){
	    	  int x = Integer.parseInt(br.readLine());
	    	  int y = Integer.parseInt(br.readLine());
	    	  String s = br.readLine();
	    	  if(s.length() == 2) {
	    		  if(s.charAt(0) == 'c' && s.charAt(1) == 'c') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == 'j' && s.charAt(1) == 'j') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == '?' && s.charAt(1) == '?') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == 'j' && s.charAt(1) == 'c') {
	    			  System.out.println("Case "+"#"+d + ": " + y);
	    		  } 
	    		  if(s.charAt(0) == 'c' && s.charAt(1) == 'j') {
	    			  System.out.println("Case "+"#"+d + ": " + x);
	    		  }
	    		  if(s.charAt(0) == 'j' && s.charAt(1) == '?') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == '?' && s.charAt(1) == 'j') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == '?' && s.charAt(1) == 'c') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == 'c' && s.charAt(1) == '?') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == 'j' && s.charAt(1) == '?') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		  if(s.charAt(0) == '?' && s.charAt(1) == 'j') {
	    			  System.out.println("Case "+"#"+d + ": " + 0);
	    		  }
	    		 
	    		  
	    	  }
	    	  boolean b = someCase(s, d);
	    	 
	    	  if(b == true) {
	    		  System.out.println("Case "+"#"+d + ": " + 0);
//	    		  continue;
	    	  }
//	    	  
//	    	  Stack<Character> st = new Stack<>();
//	    	  
//	    	  for(int i = 0; i<s.length(); i++) {
//	    		  //st.push(s.charAt(i));
//	    		  if(s.charAt(i) == '?') {
//	    			  s.replace('?','j');
//	    		  }
//	    		  //s1.replace('a','e');
//	    	  }
//	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    		  
	    	 // System.out.println("Case "+"#"+d + ": ");	  
	    	d++;
		 }


	}
	public static boolean someCase(String s, int d) {
		int count = 0, charc = 0;
		int bs = s.length() - 1;
		int cc = 0, jc = 0, qc = 0;
		for(int i = 0; i<s.length(); i++) {
			if(count == bs && charc == 1) {
				 //System.out.println("Case "+"#"+d + ": " + 0);
				 return true;	 
			}
			if(cc == bs || jc == bs || qc == bs) {
				return true;
			}
			if(s.charAt(i) != '?') {
				charc++;
			}
			if(s.charAt(i) == 'j') {
				jc++;
			}
			if(s.charAt(i) == 'c') {
				cc++;
			}
			if(s.charAt(i) == '?') {
				qc++;
			}
			
			count++;
		}
		if(cc == 0 || jc == 0 || qc == 0) {
			return true;
		}
		int as = Math.abs(cc - jc - qc);
		if(as == 0 || as == cc || as == jc || as == qc) {
			return true;
		}
		if(cc == 0 && jc != 0 && qc != 0) {
			int c = Math.abs(jc - qc);
			if(c == 0) {
				return true;
			}
		}
		if(cc != 0 && jc == 0 && qc != 0) {
			int j = Math.abs(cc - qc);
			if(j == 0) {
				return true;
			}
		}
		if(cc != 0 && jc != 0 && qc == 0) {
			int q = Math.abs(cc - jc);
			if(q == 0) {
				return true;
			}
		}
			
		return false;
	}

}
