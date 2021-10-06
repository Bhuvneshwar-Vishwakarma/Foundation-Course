package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Climb_Staris_With_Variable_Jumps_3 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] dp = new int[n + 1];
		dp[n] = 1;
		
		for(int i = n - 1; i >= 0; i--) {
			for(int j = 1; j <= arr[i] && i + j < dp.length; j++) {
				dp[i] += dp[i + j];
			}
		}
		System.out.println(dp[0]);
	}

}