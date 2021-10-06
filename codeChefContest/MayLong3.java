package codeChefContest;

import java.util.*;

public class MayLong3 {
//class Codechef {
	
	public static long power(long x, long y, long p) {
		long res = 1;
		
		x = x % p;
		
		if(x == 0) {
			return 0;
		}
		
		while(y > 0) {
			if((y & 1) != 0) {
				res = (res * x) % p;
			}
			
			y = y >> 1;
			x = (x * x) % p;
		}
		
		return res;
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			long t = sc.nextLong();
			
			while(t > 0) {
				long n = sc.nextLong();
				long answer = power(2, n - 1, 1000000000 + 7);
				System.out.println(answer);
				
				t--;
			}
		}
	}

}
