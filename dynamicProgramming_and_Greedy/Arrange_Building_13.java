package dynamicProgramming_and_Greedy;
import java.util.*;
import java.io.*;

public class Arrange_Building_13 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ob = 1;// old Building
		int os = 1;// old Space
		
		for(int i = 2; i<=n; i++) {
			int nb = os;
			int ns = ob + os;
			
			ob = nb;
			os = ns;
		}
		int total = ob + os;
		total = total * total;
		
		System.out.println(total);
	}
}
