package codeChefContest;
import java.util.*;
import java.io.*;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			t--;
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			
			cost(1, 1, n, m, 0, k);
			
		
			
		}

	}                      //1,     1,      n,     m,         cost
	public static void cost(int r, int c, int dr, int dc, int cost, int k) {
		if(r == dr && c == dc) {
			if(cost <= k) {
				System.out.println("YES");
				return;
			}else {
				System.out.println("NO");
				return;
			}
		}
		if(r > dr || c > dc) {
			return;
		}
		cost(r, c + 1, dr, dc, cost + r, k);
		cost(r + 1, c, dr, dc, cost + c, k);
		
			
	}
	
	

}
