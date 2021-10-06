package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class BuySellStocks_with_Transc_Fee_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int fee = sc.nextInt();
		
		int obsp = -arr[0]; // old bought state profit
		int ossp = 0; // old sell state profit
		
		for(int i = 1; i<arr.length; i++) {
			int nbsp = 0;
			int nssp = 0;
			
			if(ossp - arr[i] > obsp) {
				nbsp = ossp - arr[i];
			}else {
				nbsp = obsp;
			}
			
			if(arr[i] + obsp - fee > ossp) {
				nssp = arr[i] + obsp - fee;
			}else {
				nssp = ossp;
			}
			
			obsp = nbsp;
			ossp = nssp;
		}
		System.out.println(ossp);
	}

}
