package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Tilling_With_2_1_Tiles_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i<=n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.println(dp[n]);
	}

}
