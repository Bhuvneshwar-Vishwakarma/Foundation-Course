package stringsAndArrayList;
import java.io.*;
import java.util.*;

public class Toggle_Case {

	public static String solution(String str){
		StringBuilder s = new StringBuilder(str);
		
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				char upc = (char)('A' + ch - 'a');
				s.setCharAt(i, upc);
			}else if(ch >= 'A' && ch <= 'Z') {
				char lpc = (char)('a' + ch - 'A');
				s.setCharAt(i, lpc);
			}
			
		}
		return s.toString();
	
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}