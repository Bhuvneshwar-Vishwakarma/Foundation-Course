package recursion_and_Backtracking;
import java.util.*;
import java.io.*;

public class Print_Maze_Paths_With_Jumps_20 {	
	 public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        printMazePaths(1, 1, n, m, "");
	    }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        
	        if(sr == dr && sc == dc){
	            System.out.println(psf);
	            return;
	        }
	    
	        //horizontal
	        for(int ms = 1; ms<=dc - sc; ms++){
	            printMazePaths(sr, sc + ms, dr, dc, psf +"h" + ms);
	        }
	        //vertical
	        for(int ms = 1; ms<=dr - sr; ms++){
	            printMazePaths(sr + ms, sc, dr, dc, psf +"v" + ms);
	        }
	        //diagonal
	        for(int ms = 1; ms<=dc - sc && ms<= dr - sr; ms++){
	            printMazePaths(sr + ms, sc + ms, dr, dc, psf +"d" + ms);
	        }


	    }

}
