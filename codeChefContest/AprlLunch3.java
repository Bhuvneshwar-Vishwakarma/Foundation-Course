package codeChefContest;
import java.util.*;
import java.io.*;

public class AprlLunch3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			long l = sc.nextInt();// total life
			String s = sc.next();
			
			int good = 0, bad = 0;
			boolean pass = false;
			for(int i = 0; i<s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == '1') {
					good++;
				}else {
					bad++;
				}
				
				if(good >= bad) {
					pass = true;
				}
			}
			
			if(pass) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
			t--;
		}
	}

}
