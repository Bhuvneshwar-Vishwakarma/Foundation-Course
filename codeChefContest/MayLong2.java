package codeChefContest;

import java.util.*;

class Codechef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long t = sc.nextInt();
		
		while(t > 0) {
			long n = sc.nextInt();
			long x = sc.nextInt();
			long k = sc.nextInt();
			
			if(x % k == 0) {
				System.out.println("YES");
			}else if(((n + 1) - x ) % k == 0){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			t--;
		}
	}

}
