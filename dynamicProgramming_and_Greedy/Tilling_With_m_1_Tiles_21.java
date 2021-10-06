package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Tilling_With_m_1_Tiles_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] dp = new int[n + 1];
		
		for(int i = 1; i<=n; i++) {
			if(n < m) {
				dp[i] = i;
			}else if(n == m) {
				dp[i] = 2;
			}else {
				dp[i] = dp[i - 1] + dp[i - m];
			}
		}
		System.out.println(dp[n]);
	}
	

}
