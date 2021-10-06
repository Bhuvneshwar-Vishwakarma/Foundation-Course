package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Fibonacci_1 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fib = fibMemoized(n, new int[n + 1]);
		System.out.println(fib);
	}
	
	public static int fibMemoized(int n, int[] qb) {
		if(n == 0 || n == 1) {
			return n;
		}
		if(qb[n] != 0) {
			return qb[n];
		}
		System.out.println("Hello" + n);
		int fibnm1 = fibMemoized(n - 1, qb);
		int fibnm2 = fibMemoized(n - 2, qb);
		int fibn = fibnm1 + fibnm2;
		
		qb[n] = fibn;
		
		return fibn;
	}

}
