package function_and_Array_3;

import java.util.Scanner;

public class First_index_Last_index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i<a.length; i++){
	        a[i] = sc.nextInt();
	    }
	    int data = sc.nextInt();
	    
	    int lo = 0;
	    int hi = a.length - 1;
	    int fi = -1;
	    
	    while(lo <= hi) {
	    	int mid = (lo + hi) / 2;
	    	
	    	if(data > a[mid]) {
	    		lo = mid + 1;
	    	}else if(data < a[mid]) {
	    		hi = mid - 1;
	    	}else {
	    		fi = mid;
	    		hi = mid - 1;
	    	}
	    	
	    }
	    System.out.println(fi);
	    lo = 0;
	    hi = a.length - 1;
	    int li = -1;
	    
	    while(lo <= hi) {
	    	int mid = (lo + hi) / 2;
	    	
	    	if(data > a[mid]) {
	    		lo = mid + 1;
	    	}else if(data < a[mid]) {
	    		hi = mid - 1;
	    	}else {
	    		li = mid;
	    		lo = mid + 1;
	    	}
	    	
	    }
	    System.out.println(li);
	    
	}
}
