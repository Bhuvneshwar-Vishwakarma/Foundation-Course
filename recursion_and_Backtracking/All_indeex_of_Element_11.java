package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class All_indeex_of_Element_11 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
        	arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] ai = All_Index(arr, 0, x, 0);
        for(int i = 0; i<ai.length; i++) {
        	System.out.print(ai[i] + " ");
        }

	}
	public static int[] All_Index(int[] arr, int idx, int x, int fsf) {
		if(idx == arr.length) {
			return new int[fsf];
		}
		if(arr[idx] == x) {
			int[] iarr = All_Index(arr, idx + 1, x, fsf + 1);
			iarr[fsf] = idx;
			return iarr;
		}else {
			int[] iarr = All_Index(arr, idx + 1, x, fsf);
			return iarr;
		}
			
	}

}
