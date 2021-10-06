package codeChefContest;
import java.util.*;

public class MLong1 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int count = 0, fc = 0;
			for(int i = 0; i<arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			boolean isEven = false;
			while(isEven == false) {
				for(int i = 0; i<arr.length; i++) {
					sumIsEven(arr, n-1);
				}
			}
			System.out.println(count);
		}
	}
	
	
	public static int change(int i) {
		int p = Math.max(0, (i/2 - 1));
		int api = 1;
		for(int k = 1; k<=p; k++) {
			api = api * i;
		}
		return api;
	}
	public static void print(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static boolean sumIsEven(int[] arr, int n) {
		int sum = 0;
		for(int i = n-1; i>=0; i--) {
			sum += arr[i];
		}
		if(sum%2==0) {
			return true;
		}
		
		return false;
	}

}
