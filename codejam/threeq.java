package codejam;
//import java.util.*;
import java.io.*;
public class threeq {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  System.out.println("Enter no. of test cases");
	      int t = Integer.parseInt(br.readLine());
	      int x = 1;
	      while(x <= t){
	    	  int n = Integer.parseInt(br.readLine());
	    	  int[] arr = new int[n];
	    	  for(int i = 0; i<arr.length; i++) {
	    		  arr[i] = Integer.parseInt(br.readLine());
	    		 // 7
	    		 // 7 6 5 4 3 2 1
	    	  }
	    	 
	    	  int sum = 0;
	    	  int j, l;
	    	  for(int i = 0; i<=n; i++) {
	    		  if(i == n) {
	    			  break;
	    		  }
	    		  j = arr[i];
	    		  l = i;
	    		  
	    		  for(int k = i; k <n; k++) {
	    			  if(arr[k] < j) {
	    				  j = arr[k];
	    				  l = k;
	    			  }
	    		  }
	    		  
	    		  for(int m = 1; m<= l; m++) {
	    			for(int p = 1; p<=l; p++) {  
	    				if(arr[m] <arr[p]) {
	    					int temp = arr[m];
	    					arr[m] = arr[p];
	    					arr[p] = temp;
	    				}
	    			}
	    		  }
	    		  sum = sum + (l - i + 1);
	    		  
	    	  }
	    	  System.out.println("Case "+"#"+x + ": "+ sum);	  
	    	x++;
	      }
	}
	
	public static void print(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
	  			
	  			
	  				
	  					
	  					
	  			
	  			


