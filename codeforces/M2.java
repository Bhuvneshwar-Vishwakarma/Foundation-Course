package codeforces;
import java.util.*;
import java.io.*;

public class M2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			
			if(n == 1) {
				System.out.println("YES");
				
			}else {
				HashMap<Character, Integer> map = new HashMap<>();
				Stack<Character> st = new Stack<>();
				char fc = str.charAt(0);
				map.put(fc, 0);
				for(int i = 1; i<str.length(); i++) {
					char ch = str.charAt(i);
					st.push(ch);
				}
				for(int i = 0; i<st.size(); i++) {
					char popchar = st.pop();
					
					if(popchar != st.peek() && map.containsKey(st.peek())) {
						System.out.println("NO");
						break;
					}
					map.put(popchar, 0);
					
				}
				System.out.println("YES");
				
				
//				Character[] carr = new Character[str.length()];
//				boolean flag = true;
//				for(int i = 0; i<carr.length; i++) {
//					if()
//				}
				
			}
			
			
			
			
			
			t--;
		}
	}

}
