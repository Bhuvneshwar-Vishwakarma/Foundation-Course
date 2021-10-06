package codeChefContest;
import java.util.*;
import java.io.*;

public class AprilStart_2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) {
			
			int x = sc.nextInt();//food
			int y = sc.nextInt();//water
			int xr = sc.nextInt();//food supplies per day
			int yr = sc.nextInt();//water supplies per day
			int d = sc.nextInt();
			
			int food = 0;
			int water = 0;
			for(int i = 0; i<d; i++) {
				food += xr;
				water += yr;
				
				if(food > x) {
					System.out.println("NO");
					return;
				}
				if(water > y) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
			
			t--;
		}
	}

}
