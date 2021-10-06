/**
 * @author Bhuvneshwar
 */
package stringsAndArrayList;
import java.util.*;
import java.io.*;

public class Remove_Primes {

	public static void solution(ArrayList<Integer> al) {
		for(int i = al.size() - 1; i>=0; i--) {
			int val = al.get(i);
			if(isPrime(val) == true) {
				al.remove(i);
			}
		}
	}
	public static boolean isPrime(int val) {
		for(int i = 2; i*i<=val; i++) {
			if(val%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			al.add(sc.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
