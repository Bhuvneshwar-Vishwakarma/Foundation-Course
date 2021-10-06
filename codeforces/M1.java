package codeforces;
import java.util.*;
import java.io.*;

public class M1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int n = sc.nextInt();// n of gold pieces
			long x = sc.nextLong();// weight
			int[] wt = new int[n];
			for(int i = 0; i<wt.length; i++) {
				wt[i] = sc.nextInt();
			}
			
			int max = Integer.MIN_VALUE;
			int maxidx = 0;
			for(int i = 0; i<wt.length; i++) {
				if(wt[i] > max) {
					max = wt[i];
					maxidx = i;
				}
			}
			int min = Integer.MAX_VALUE;
			int minidx = 0;
			for(int i = 0; i<wt.length; i++) {
				if(wt[i] < min) {
					min = wt[i];
					minidx = i;
				}
			}

			int sum = 0;
			for(int i = 0; i<wt.length; i++) {
				
				sum += wt[i];
				if(sum < x) {
					int temp = wt[i];
					wt[i] = wt[maxidx];
					wt[maxidx] = temp;
					break;
				}
			}
			if(min > x || max > x) {
				System.out.println("YES");
//				System.out.println(sum);
				for(int i = 0; i<wt.length; i++) {
					System.out.print(wt[i]);
				}
				System.out.println();
			}else {
				System.out.println("NO");
			}
			
			t--;
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}