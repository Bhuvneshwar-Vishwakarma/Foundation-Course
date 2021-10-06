package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Unbound_Knapsack_11 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] vals = new int[n];
		for(int i = 0; i<n; i++) {
			vals[i] = sc.nextInt();
		}
		int[] wts = new int[n];
		for(int i = 0; i<n; i++) {
			wts[i] = sc.nextInt();
		}
		int cap = sc.nextInt();
		int[] dp = new int[cap + 1];
		dp[0] = 0;
		
		for(int bagc = 1; bagc <= cap; bagc++) {
			int max = 0;
			for(int i = 0; i<n; i++) {
				if(bagc >= wts[i]) {
					int rBagc = bagc - wts[i];
					int rBagv = dp[rBagc];
					int tBagv = rBagv + vals[i];
					
					if(tBagv > max) {
						max = tBagv;
					}
				}
			}
			dp[bagc] = max;
		}
		System.out.println(dp[cap]);
	}

}
