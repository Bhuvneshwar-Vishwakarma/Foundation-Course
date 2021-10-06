package codeChefContest;
import java.util.*;
import java.io.*;

public class Starter2 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		// Start Coding Here............
		int t = sc.nextInt();
		while(t > 0) {
			int n = sc.nextInt(); int m = sc.nextInt();
			
			int x = sc.nextInt(); int y = sc.nextInt();
			
			String[][] arr = new String[n][m];
			
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<m; j++) {
					arr[i][j] = sc.next();
				}
				
			}
			for(int i = 0; i<n; i++) {
				for(int j = 0; j<m; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
				
			}
			
			for(int i = 0; i<n; i++) {
				int cpass = 0; // complete pass
				int p = 0;// partialy pass
				int u = 0;// fail
				
				for(int j = 0; j<m; j++) {
					
					if(arr[i][j] == "P") {//partial
						p++;
						System.out.println("HELLO-P");
						if(p >= y) {
							System.out.print(1);
							return;
						}
						
					}else if(arr[i][j] == "F") {// complete
						cpass++;
						if(cpass >= (x - 1)) {
							System.out.print(1);
							return;
						}
					}else if(arr[i][j] == "U"){// Unsolved
						u++;
						if(u >= arr[0].length) {
							System.out.print(0);
							System.out.print("HELLO");
							
							return;
						}	
					}
				}
			}
				
			t--;
		}
	}
	
}