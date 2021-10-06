package recursion_and_Backtracking;
import java.util.Scanner;

public class Print_Stairs_Paths_18 {

	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			printStairsPaths(n, "");
		}
	}
	public static void printStairsPaths(int n, String paths) {
		if(n < 0) {
			return;
		}
		if(n == 0) {
			System.out.println(paths);
			return;
		}
		
		printStairsPaths(n - 1, paths + "1");
		printStairsPaths(n - 2, paths + "2");
		printStairsPaths(n - 3, paths + "3");
	}

}
