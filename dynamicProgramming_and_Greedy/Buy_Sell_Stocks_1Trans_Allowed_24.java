package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Buy_Sell_Stocks_1Trans_Allowed_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] prices = new int[n];
		for(int i = 0; i<prices.length; i++) {
			prices[i] = sc.nextInt();
		}
		
		int lsf = Integer.MAX_VALUE; // Least so far
		int op = 0; // Overall profit
		int pist = 0;
		
		for(int i = 0; i<prices.length; i++) {
			if(prices[i] < lsf) {
				lsf = prices[i];
			}
			
			pist = prices[i] - lsf;
			
			if(pist > op) {
				op = pist;
			}
		}
		
		System.out.println(op);
		
	}

}
