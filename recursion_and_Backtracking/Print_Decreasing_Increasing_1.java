package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Print_Decreasing_Increasing_1 {

	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        decreasingAndINcreasinng(n);
//	        System.out.println(f);
	}

    public static void decreasingAndINcreasinng(int n){
	        if(n == 0){
	            return;
	        }
	        System.out.println(n);
	        decreasingAndINcreasinng(n - 1);
	        System.out.println(n);
	}
}