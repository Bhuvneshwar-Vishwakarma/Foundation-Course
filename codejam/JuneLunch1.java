package codejam;
import java.util.*;

public class JuneLunch1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();
			
			while(t > 0) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int k = sc.nextInt();
				int count = 0;
				
				int[][] arr = new int[n][m];
				int[][] dp = new int[n][m];
				
				for(int i = 0; i< n * m; i++) {

						int ith = sc.nextInt();
						int jth = sc.nextInt();
						arr[ith - 1][jth - 1] = 1;
						int ansPos = solve(arr,ith - 1, jth - 1, dp, k, n, m);
						count++;
						if(ansPos == k) {
							if(count % 2 == 0) {
								System.out.println("Alice");
								break;
							}else if(count % 2 == 1){
								System.out.println("Bob");
								break;
							}else {
								System.out.println("Draw");
								break;
							}
						}
					
				}
				
				t--;
			}
		}
	}
	
	public static int solve(int[][] arr, int i, int j, int[][] dp, int k,int n, int m) {
		
		dp[i][j] = arr[i][j];
		
		if(i == n - 1 || j == m - 1) {
			return dp[i][j];
		}else {
			if(dp[i][j] == dp[i + 1][j + 1]) {
				if(dp[i][j] == dp[i][j + 1]) {
					if(dp[i][j] == dp[i + 1][j]) {
						dp[i][j] = arr[i][j] + 1; 
					}
				}
			}
		}
		
		
		
		return dp[i][j];
	}

}
