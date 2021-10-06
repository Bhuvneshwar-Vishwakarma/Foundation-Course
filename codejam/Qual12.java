package codejam;
//import java.util.*;
import java.io.*;
public class Qual12 {

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
	    	  print(arr, n);
	    	  for(int i = arr.length - 1; i>=0; i--) {
	    		  if(i == 1) {
	    			  int temp = arr[i];
	    			  arr[i] = arr[i + 1];
	    			  arr[i + 1] = temp;
	    			  break;
	    		  }
	    		  else if(arr[i] > arr[i - 1]) {//a[j+1] < a [j]
	    			  int temp = arr[i];
	    			  arr[i] = arr[i - 1];
	    			  arr[i - 1] = temp;
	    		  }
	    	  }
	    	  print(arr, n);
//	    	  int min = Integer.MAX_VALUE;
//	    	  int max = Integer.MIN_VALUE;
//	    	  for(int i = 0; i<arr.length - 1; i++) {
//	    		  if(arr[i] < min) {
//	    			  min = arr[i];
//	    		  }
//	    		  if(arr[i] > max) {
//	    			  max = arr[i];
//	    		  }
//	    		    
//	    	  }
//	    	  
//	    	  System.out.println("min " + min);
//	    	  System.out.println("Max " +max);
	    	x++;
	      }
	}
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	public static void print(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
	  			
	  			
	  				
	  					
	  					
	  			
	  			


