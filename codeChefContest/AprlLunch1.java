package codeChefContest;
import java.util.*;
import java.io.*;

public class AprlLunch1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int n = sc.nextInt();
			long a = sc.nextInt();
			long b = sc.nextInt();
			
			long sarth = 0, anu = 0;
			for(int i = 0; i<n; i++) {
				String s = sc.next();
				char ch = s.charAt(0);
				
				if(ch == 'E' || ch == 'Q' || ch == 'U' || ch == 'I' || ch == 'N' || ch == 'O' || ch == 'X') {
					sarth += a;
				}else {
					anu += b;
				}
			}
			if(sarth > anu) {
				System.out.println("SARTHAK");
			}else if(anu > sarth) {
				System.out.println("ANURADHA");
			}else {
				System.out.println("DRAW");
			}
			
			//*******MY Solution
			
//			String[] arr = new String[n];
//			for(int i = 0; i<n; i++) {
//				arr[i] = sc.next();
//			}
//			long sarth = 0;
//			long anu = 0;
//			
//			String str = "EQUINOX";
//			HashMap<Character, Integer> map = new HashMap<>();
//			for(int i = 0; i<str.length(); i++) {
//				char ch = str.charAt(i);
//				map.put(ch, 0);
//			}
//			
//			for(int i = 0; i<arr.length; i++) {
//				String s = arr[i];
//				char ch1 = s.charAt(0);
//				if(map.containsKey(ch1)) {
//					sarth = sarth + a;
//				}else {
//					anu = anu + b;
//				}
//			}
//
//			if(sarth > anu) {
//				System.out.println("SARTHAK");
//			}else if(anu > sarth) {
//				System.out.println("ANURADHA");
//			}else {
//				System.out.println("DRAW");
//			}
//			
			t--;
		}
	}

}
