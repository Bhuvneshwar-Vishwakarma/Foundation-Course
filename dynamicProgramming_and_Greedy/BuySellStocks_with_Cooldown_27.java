package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class BuySellStocks_with_Cooldown_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int obsp = -arr[0]; // old bought state profit
		int ossp = 0; // old sell state profit
		int ocsp = 0;
		
		for(int i = 1; i<arr.length; i++) {
			int nbsp = 0;
			int nssp = 0;
			int ncsp = 0;
			
			if(ocsp - arr[i] > obsp) {
				nbsp = ocsp - arr[i];
			}else {
				nbsp = obsp;
			}
			
			if(arr[i] + obsp > ossp) {
				nssp = arr[i] + obsp;
			}else {
				nssp = ossp;
			}
			
			if(ossp > ocsp) {
				ncsp = ossp;
			}else {
				ncsp = ocsp;
			}
			
			obsp = nbsp;
			ossp = nssp;
			ocsp = ncsp;
		}
		System.out.println(ossp);
	}


	
}
