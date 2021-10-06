package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class First_Index_of_an_Element_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int fi = first_Index(arr, 0, x);
        System.out.println(fi);

	}
	public static int first_Index(int[] arr, int idx, int x) {
		if(idx == arr.length) {
			return -1;
		}
		if(arr[idx] == x) {
			return idx;
		}else {
			int fiisa = first_Index(arr, idx + 1, x);
			return fiisa; 
		}
		
	}
}
