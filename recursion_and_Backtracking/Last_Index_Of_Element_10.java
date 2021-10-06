package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Last_Index_Of_Element_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int li = last_Index(arr, 0, x);
        System.out.println(li);

	}
	public static int last_Index(int[] arr, int idx, int x) {
		if(idx == arr.length) {
			return -1;
		}
		int liisa = last_Index(arr, idx + 1, x);
		if(liisa == -1) {
			if(arr[idx] == x) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return liisa; 
		}
			
	}
}
		
