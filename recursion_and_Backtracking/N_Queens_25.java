package recursion_and_Backtracking;
import java.util.*;

public class N_Queens_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] chess = new int[n][n];
		print_N_Queens(chess, "", 0);
		
	}
	public static void print_N_Queens(int[][] chess, String qsf, int row) {
		if(row == chess.length) {
			System.out.println(qsf + ".");
			return;
		}
		
		for(int col = 0; col<chess.length; col++) {
			if(isSafePlaceForQueen(chess, row, col) == true) {
				chess[row][col] = 1;
				print_N_Queens(chess, qsf + row +"-"+col+", " , row + 1);
				chess[row][col] = 0;
			}	
		}
	}
	public static boolean isSafePlaceForQueen(int[][] chess, int row, int col) {
		
		for(int i = row - 1, j = col; i>=0; i--) {// vertical
			if(chess[i][j] == 1) {
				return false;
			}
		}
		for(int i = row - 1, j = col - 1; i>=0 && j>=0; i--, j--) {// right diagonal
			if(chess[i][j] == 1) {
				return false;
			}
		}
		for(int i = row - 1, j = col + 1; i>=0 && j<chess.length; i--, j++) {// right diagonal
			if(chess[i][j] == 1) {
				return false;
			}
		}
		
		return true;
		
	}

}