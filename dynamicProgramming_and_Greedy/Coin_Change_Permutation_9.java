package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;
//https://pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/coin-change-permutations-official/ojquestion
public class Coin_Change_Permutation_9 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coins = new int[n];
		for(int i = 0; i<coins.length; i++) {
			coins[i] = sc.nextInt();
		}
		int tar = sc.nextInt();
		int[] dp = new int[tar + 1];
		dp[0] = 1;
		
		for(int amt = 1; amt<=tar; amt++) {
			for(int coin: coins) {
				if(amt >= coin) {
					dp[amt] += dp[amt - coin];
				}
			}
		}
		
		System.out.println(dp[tar]);
	}
}
