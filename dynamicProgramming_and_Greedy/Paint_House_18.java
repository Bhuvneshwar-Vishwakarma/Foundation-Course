package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Paint_House_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] arr = new int[n][c];
		
		int[][] dp = new int[n][c];
		
		int least = Integer.MAX_VALUE;
		int sleast = Integer.MAX_VALUE;
		
		for(int j = 0; j < arr[0].length; j++) {
			dp[0][j] = arr[0][j];
			if(arr[0][j] <= least) {
				sleast = least;
				least = arr[0][j];
			}else if(arr[0][j] <= sleast) {
				sleast = arr[0][j];
			}
		}
		
		for(int i = 1; i < dp.length; i++) {
			int nleast = Integer.MAX_VALUE;
			int nsleast = Integer.MAX_VALUE;
			
			for(int j = 0; j<dp[0].length; j++) {
				
				if(least == dp[i - 1][j]) {
					dp[i][j] = sleast + arr[i][j];
				}else {
					dp[i][j] = least + arr[i][j];
				}
				
				
				if(dp[i][j] <= nleast) {
					nsleast = nleast;
					nleast = dp[i][j];
				}else if(dp[i][j] <= nsleast) {
					nsleast = arr[0][j];
				}
			}
			
			least = nleast;
			sleast = nsleast;
		}
		
		System.out.println(least);
	}

}
