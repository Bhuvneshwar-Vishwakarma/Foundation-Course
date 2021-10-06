package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Print_Subsequences_16 {

    public static void main(String[] args) throws Exception {
    	Scanner sc =  new Scanner(System.in);
    	String str = sc.next();
    	printSS(str, "");
    }
    // tu yaha 2 possibility hai aayenege ya nahi aayeynge

 
    public static void printSS(String str, String ans) {
    	if(str.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	
    	char ch = str.charAt(0);
    	String ros = str.substring(1);
    	printSS(ros, ans + ch);
    	printSS(ros, ans + "");
    }

}
