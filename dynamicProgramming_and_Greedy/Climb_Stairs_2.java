package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;
//https://pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/climb-stairs-official/ojquestion
public class Climb_Stairs_2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int cp = countPathMemoization(n, new int[n + 1]);
		int cp = countPathTebolation(n);
		
		System.out.println(cp);
	}
	public static int countPathMemoization(int n, int[] qb) {
		if(n == 0) {
			return 1;
		}else if(n < 0) {
			return 0;
		}
		if(qb[n] != 0) {
			return qb[n];
		}
		int cpnm1 = countPathMemoization(n - 1, qb);
		int cpnm2 = countPathMemoization(n - 2, qb);
		int cpnm3 = countPathMemoization(n - 3, qb);
		int cpn = cpnm1 + cpnm2 + cpnm3;
		
		qb[n] = cpn;
		
		return cpn;
	}
	public static int countPathTebolation(int n) {
		
		int[] dp = new int[n + 1];
		
		dp[0] = 1;
		
		for(int i = 1; i<=n; i++) {
			if(i == 1) {
				dp[i] = dp[i - 1];
			}else if(i == 2) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}else {
				dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
			}
		}
		
		return dp[n];
	}

}
