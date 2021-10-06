package two_D_Array_4;
import java.util.Scanner;
public class Rotate_By_90_Degree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] arr = new int[n][n];
	    for(int i = 0; i<arr.length; i++){
	       for(int j = 0; j < arr[0].length; j++) {
	    	   arr[i][j] = sc.nextInt();
	       }
	    }
	    
	    //transpose of a matrix
	    for(int i = 0; i<arr.length; i++) {
	    	for(int j = i; j<arr[0].length; j++) {
	    			int temp = arr[i][j];
	    			arr[i][j] = arr[j][i];
	    			arr[j][i] = temp;
	    	}
	    }
	    //reverse column
	    for(int i = 0; i<arr.length; i++) {
	    	int li = 0;
	    	int ri = arr[i].length - 1;
	    	
	    	while(li < ri) {
	    		int temp = arr[i][li];
	    		arr[i][li] = arr[i][ri];
	    		arr[i][ri] = temp;
	    		
	    		li++;
	    		ri--;
	    	}
	    }
	    
	}

}
