package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Max_Of_an_Array_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        int max = Max_Of_Array(arr, 0);
        System.out.println(max);

	}
	public static int Max_Of_Array(int[] arr, int idx) {
		if(idx == arr.length) {
			return 0;
		}
		int max = Max_Of_Array(arr, idx + 1);
		if(arr[idx] > max) {
			max = arr[idx];
		}
		return max;
	}
}
