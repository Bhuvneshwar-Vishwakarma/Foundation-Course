package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Print_ZigZag_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print_ZigZag(n);
	}
	public static void print_ZigZag(int n) {
		if(n == 0) {
			return;
		}
		System.out.println("Pre" + n);
		print_ZigZag(n - 1);
		System.out.println("In" + n);
		print_ZigZag(n - 1);
		System.out.println("Post" + n);
	}

}
