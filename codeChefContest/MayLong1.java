package codeChefContest;
import java.util.*;
import java.io.*;

public class MayLong1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t > 0) {
			int x = sc.nextInt();
			if(!(x >= 31 && x <= 40)) {
				continue;
			}
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int in = a + (100 - x) * b;
			int ans = in * 10;
			System.out.println(ans);
			t--;
		}

	}

}
