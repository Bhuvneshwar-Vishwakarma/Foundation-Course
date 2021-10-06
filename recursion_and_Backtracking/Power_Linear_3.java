package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Power_Linear_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(power(n, x));
        System.out.println(powerInLogTime(n, x));
	}
	
	public static int power(int n, int x) {
		if(x == 0) {
			return 1;
		}
		
		int pnm1 = power(n, x - 1);
		int pn = pnm1 * n;
		return pn;
	}
	public static int powerInLogTime(int n, int x) {
		if(x == 0) {
			return 1;
		}
		
		int pnm1 = power(n, x/2);
		int pn = pnm1 * pnm1 ;
		if(x%2==1) {
			pn = pn * n;
		}
		return pn;

	}

}
