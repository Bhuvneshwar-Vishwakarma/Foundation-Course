package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;
//Ques. => https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/count-binary-strings-official/ojquestion

public class Count_Binary_String_12 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oczeros = 1;
		int ocones = 1;
		
		for(int i = 2; i<=n; i++) {
			int nczeros = ocones;
			int ncones = oczeros + ocones;
			
			oczeros = nczeros;
			ocones = ncones;
		}
		System.out.println(oczeros + ocones);
		
		//Second approach
		
//		int[] dp0 = new int[n + 1];
//		int[] dp1 = new int[n + 1];
//		dp0[1] = 1;
//		dp1[1] = 1;
//		
//		for(int i = 2; i<=n; i++) {
//			dp0[i] = dp1[i - 1];
//			dp1[i] = dp0[i - 1] + dp1[i - 1];
//		}
//		System.out.println(dp0[n] + dp1[n]);
		
	}

}
