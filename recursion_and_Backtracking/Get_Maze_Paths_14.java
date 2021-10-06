package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Get_Maze_Paths_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<String> paths = getMazePath(1, 1, n, m);
		System.out.println(paths);
	}
	// sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
	
	public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){
		if(sr == dr && sc == dc) {
			ArrayList<String> ba = new ArrayList<>();
			ba.add("");
			return ba;
		}
		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();
		
		if(sc < dc) {
			hpaths = getMazePath(sr, sc + 1, dr, dc);
		}
		if(sr < dr) {
			vpaths = getMazePath(sr + 1, sc, dr, dc);
		}
		ArrayList<String> paths = new ArrayList<>();
		
		for(String hpath : hpaths) {
			paths.add("h" + hpath);
		}
		for(String vpath : vpaths) {
			paths.add("v" + vpath);
		}
		return paths;
	}

}
