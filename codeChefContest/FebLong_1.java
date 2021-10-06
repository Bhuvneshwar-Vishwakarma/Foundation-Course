package codeChefContest;
import java.io.*;
import java.util.*;
public class FebLong_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] ge = new int[9];
		
		for(int i = 1; i<9; i++) {
			if(num % i == 0) {
				ge[i] = i;
			}
		}
		
		int max = Arrays.stream(ge).max().getAsInt(); 
		System.out.println(max);
//		static int largest() 
//	     { 
//	         int i; 
//	         int max = ge[0]; 
//	        
//	         // Traverse array elements from second and 
//	         // compare every element with current max   
//	         for (i = 1; i < ge.length; i++) 
//	             if (ge[i] > max) 
//	                 max = ge[i]; 
//	        
//	         return max; 
//	     } 
		
		
	}

}
