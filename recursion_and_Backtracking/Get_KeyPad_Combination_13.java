package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Get_KeyPad_Combination_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> res = getKPC(str);
		System.out.println(res);

	}
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
	public static ArrayList<String> getKPC(String str){
		
		if(str.length() == 0) {
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres = getKPC(ros);
		ArrayList<String> mres = new ArrayList<>();
		
		String codeforch = codes[ch - '0']; 
		for(int i = 0; i<codeforch.length(); i++) {
			char chcode = codeforch.charAt(i);
			for(String rstr : rres) {
				mres.add(chcode + rstr);
			}
		}
		return mres;
	}

}
