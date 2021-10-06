package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class BuySellStocks_TwoTranscAllowed_28 {
	 public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for(int i = 0; i<arr.length; i++){
			    arr[i] = sc.nextInt();
			}
			
			int mpist = 0;
			int leastsf = arr[0];
			int[] dpl = new int[arr.length];
			
			for(int i = 1; i<arr.length; i++) {
				if(arr[i] < leastsf) {
					leastsf = arr[i];
				}
				
				mpist = arr[i] - leastsf;
				if(mpist > dpl[i - 1]) {
					dpl[i] = mpist;
				}else {
					dpl[i] = dpl[i - 1];
				}
			}
			
			int mpibt = 0;
			int maxat = arr[arr.length - 1];
			int[] dpr = new int[arr.length];
			
			for(int i = arr.length - 2; i>=0; i--) {
				if(arr[i] > maxat) {
					maxat = arr[i];
				}
				
				mpibt = maxat - arr[i];
				if(mpibt > dpr[i + 1]) {
					dpr[i] = mpibt;
				}else {
					dpr[i] = dpr[i + 1];
				}
			}
			
			int op = 0;
			for(int i = 0; i<arr.length; i++) {
				if(dpl[i] + dpr[i] > op) {
					op = dpl[i] + dpr[i];
				}
			}
			System.out.println(op);

	    }


}
