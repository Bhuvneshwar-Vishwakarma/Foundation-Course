package codejam;
import java.util.*;
import java.io.*;

class Main {
	
	public static long solve(long g) {
		long count = 0; 
		for(long i = 1; i<=g; i++) {
			long sum = 0;
			for(long j = i; j<=g; j++) {
				sum += j;
				if(sum == g) {
					count++;
					break;
				}
			}
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			long g = sc.nextInt();
			long k = g / 2;
			int c = 1;
			long ans = solve(g);
			System.out.println("Case #" + c +": " + ans);
			c++;
			t--;
		}

	}

}
