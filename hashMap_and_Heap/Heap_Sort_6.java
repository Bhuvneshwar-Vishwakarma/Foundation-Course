package hashMap_and_Heap;
import java.util.*;

public class Heap_Sort_6 {

	public static void main(String[] args) {
		
		int[] arr = {89, 56, 1, 2, 3, 45, 102, 78};
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); for decreasing order
		PriorityQueue<Integer> pq = new PriorityQueue<>();// for increasing order
		for(int val : arr) {
			pq.add(val);
		}
		while(pq.size() > 0) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}

}
