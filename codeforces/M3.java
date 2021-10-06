package codeforces;
import java.util.*;
import java.io.*;

public class M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			solve(a, b);
			t--;
			
		}

	}
	public static void solve(long a, long b) {
		HashSet<Long> set = new HashSet<>();
		
		long ab = a * b;
		long ablim = a * b * 10;
		long z = 0;
		long x = 0;
		long y = 0;
		
		for(long i = ablim; i>=0; i--) {
			if(i % ab == 0) {
				if(set.contains(i)) {
					
				}
				set.add(i);
			}
			if(i % a == 0) {
				x = i;
			}
		}
	}

}
