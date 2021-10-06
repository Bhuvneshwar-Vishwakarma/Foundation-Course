package codeChefContest;
import java.util.*;
import java.io.*;

public class Cracker_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int x = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += arr[i];
		}
		if(sum <= 12) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
			
		
		
	
		
