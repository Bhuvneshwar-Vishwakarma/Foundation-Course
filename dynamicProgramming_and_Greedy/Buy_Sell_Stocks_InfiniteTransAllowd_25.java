package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Buy_Sell_Stocks_InfiniteTransAllowd_25 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int bd = 0;
		int sd = 0;
		int profit = 0;
		
		for(int i = 1; i<arr.length; i++) {
			
			if(arr[i] >= arr[i - 1]) {
				sd++;
			}else {
				profit += arr[sd] - arr[bd];
				bd = sd = i;
			}
		}
		profit += arr[sd] - arr[bd];
		System.out.println(profit);
	}

}
