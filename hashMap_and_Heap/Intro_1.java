package hashMap_and_Heap;

import java.util.*;

public class Intro_1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("India", 135);
		hm.put("China", 160);
		hm.put("Pak", 30);
		hm.put("US", 20);
		hm.put("UK", 10);
		System.out.println(hm);
		
		hm.put("Nigeria", 5);
		hm.put("US", 25);
		hm.remove("Pak");
		
		System.out.println(hm);
		
		System.out.println(hm.get("India"));//access by key will give value on it
		System.out.println(hm.get("Utopia"));//gives null bcoz not exist in hashmap
		System.out.println(hm.containsKey("India"));//give true
		System.out.println(hm.containsKey("Utopia"));// give false
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);

	}

}
