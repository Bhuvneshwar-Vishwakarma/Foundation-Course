package stringsAndArrayList;
import java.util.Scanner;

public class All_Palindromic_SubStrings_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		solution(s);

	}
	public static void solution(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				String subStr = str.substring(i, j);
				if(isPalindrome(subStr)) {
					System.out.println(subStr);
				}
			}
		}
	}
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length();
		
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
}
