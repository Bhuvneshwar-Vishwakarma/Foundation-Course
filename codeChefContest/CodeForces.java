package codeChefContest;
import java.util.*;
import java.io.*;

public class CodeForces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			t--;
			
			long r = sc.nextInt();
			long b = sc.nextInt();
			long d = sc.nextInt();
			
			long abs = Math.abs(r - b);
			if(d == 0) {
				if(r == b) {
					System.out.println("YES");
					continue;
				}else {
					System.out.println("NO");
					continue;
					
				}
			}
			
			if(r == 1 || b == 1) {
				if(abs >= d) {
					System.out.println("NO");
					continue;
				}else {
					System.out.println("YES");
				}
			}
			
//			for(int i = )
			long rem = r / b;
			long rem2 = Math.abs(r - b);
			if(rem <= rem2) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
				
			}
			

			
		}
				
	}

}
