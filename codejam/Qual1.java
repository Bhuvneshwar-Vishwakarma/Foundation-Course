package codejam;
//import java.util.*;
import java.io.*;
public class Qual1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int t = Integer.parseInt(br.readLine());
	      int x = 1;
	      while(x <= t){
	    	  int n = Integer.parseInt(br.readLine());
	    	  int[] arr = new int[n];
	    	  for(int i = 0; i<arr.length; i++) {
	    		  arr[i] = Integer.parseInt(br.readLine());
	    	  }
	    	  // [5, 3, 8, 9, 2]
	    	  int cost = 0;
	    	  for(int i = arr.length - 1; i>0; i++) {
	    		  boolean sorted = true;
	    		  for(int j = 0; j<n-1; j++) {
	    			  if(arr[j+1] < arr[j]){
	    				  int temp = arr[j+1];
	    				  arr[j+1] = arr[j];
	    				  arr[j] = temp;
	    				  sorted = false;
	    				  cost++;
	    			  }
//	    			  cost = cost + i;
	    		  }
	    		  //if(sorted) break;
	    		  if(sorted == true) {
	    			  System.out.println(cost);
	    			  break;
	    		  }
	    		  //4 2 1 3

	    	  }
//	    	  for(int e: arr) {
//	    		  System.out.print(e +" ");
//	    	  }
//	    	  System.out.println("Case "+"#"+x + ": "+ cost);//Case #1: 6
	    	  
	    	  x++;
	      }
	}
}
	  			
	  			
	  				
	  					
	  					
	  			
	  			


