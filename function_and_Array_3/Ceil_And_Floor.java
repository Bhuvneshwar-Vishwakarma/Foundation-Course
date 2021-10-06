package function_and_Array_3;
import java.util.Scanner;
public class Ceil_And_Floor {

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
	    int ceil = 0;// just bigger
	    int floor = 0;// just smaller
	    
	    while(lo <= hi) {
	    	int mid = (lo + hi) / 2;
	    	
	    	if(data < a[mid]) {
	    		hi = mid - 1;
	    		ceil = a[mid];
	    	}else if(data > a[mid]) {
	    		lo = mid + 1;
	    		floor = a[mid];
	    	}else {
	    		ceil = a[mid];
	    		floor = a[mid];
	    		break;
	    	}
	    }
	    System.out.println(ceil);
	    System.out.println(floor);
	}

}
