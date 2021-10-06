package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class DisplayArray_In_Reverse_7 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        printInReverse(arr, 0);

	}
	public static void printInReverse(int[] arr, int idx) {
		if(idx == arr.length) {
			return;
		}
		printInReverse(arr, idx + 1);
		System.out.println(arr[idx]);
	}

}
