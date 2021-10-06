package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Get_Stairs_Paths {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> res = getStairPaths(n);
		System.out.println(res);

	}
	public static ArrayList<String> getStairPaths(int n) {	 
		
		if(n == 0) {
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}else if(n < 0) {
			ArrayList<String> ba = new ArrayList<>();
			return ba;
		}
		
		ArrayList<String> path1 = getStairPaths(n - 1);
		ArrayList<String> path2 = getStairPaths(n - 2);
		ArrayList<String> path3 = getStairPaths(n - 3);
		
		ArrayList<String> mres = new ArrayList<>();
		
		for(String rstr : path1) {
			mres.add(1 + rstr);
		}
		for(String rstr : path2) {
			mres.add(2 + rstr);
		}
		for(String rstr : path3) {
			mres.add(3 + rstr);
		}
		 
		return mres;
	}
}
