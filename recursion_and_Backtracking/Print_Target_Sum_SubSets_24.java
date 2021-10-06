package recursion_and_Backtracking;
import java.util.*;
import java.io.*;
//https://pepcoding.com/resources/online-java-foundation/recursion-backtracking/target-sum-subsets-official/ojquestion
public class Print_Target_Sum_SubSets_24 {
//	 	public static void main(String[] args) throws Exception {
//	 		Scanner sc = new Scanner(System.in);
//	 		int n = sc.nextInt();
//	 		int[] arr = new int[n];
//	 		for(int i = 0; i<arr.length; i++) {
//	 			arr[i] = sc.nextInt();
//	 		}
//	 		int tar = sc.nextInt();
//	 		printTargetSumSubsets(arr, 0, "", 0, tar);
//	    }

	    // set is the subset
	    // sos is sum of subset
	    // tar is target
	    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
	        
	    	if(idx == arr.length) {
	    		if(sos == tar) {
	    			System.out.println(set + ".");
	    		}
	    		return;
	    	}
	    	
	    	printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
	    	printTargetSumSubsets(arr, idx + 1, set, sos, tar);
	    }
}
