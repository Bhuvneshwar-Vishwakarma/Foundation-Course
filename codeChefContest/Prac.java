package codeChefContest;

import java.util.*;
public class Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 2; i<n; i++) {
			int d = n/i;
			int ans = d + i;
			
			
			
			if(hm.containsKey(ans)) {
				int oa = hm.get(ans);
				int na = oa + 1;
				hm.put(ans, na);
			}else {
				hm.put(ans, 1);
			}
		}
//		int rem = 0;
//		while(n > 0) {
//			rem = n % 10;
//			n = n / 10;
//		}
//		int mfc = 1;
//		for(int key: hm.keySet()) {
//			if(hm.get(key) > hm.get(mfc)) {
//				mfc = key;
//			}
//		}
		System.out.println(hm);

	}

}
