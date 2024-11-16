package codes;

import java.util.*;
public class SymmetricPairs {
	
	public static void findSymmetricPairs(int pairs[][]) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int[] pair: pairs) {
			int first = pair[0];
			int second = pair[1];
			
			if(map.containsKey(second)&& map.get(second)==first) {
				System.out.println(first+" "+second+" ");
			}else
				map.put(first, second);
		}
	}

	public static void main(String[] args) {
		int[][] pairs = {
	            {1, 2},
	            {3, 4},
	            {5, 9},
	            {2, 1},
	            {4, 3},
	            {9, 5}
	        };

	        findSymmetricPairs(pairs);
	}
}
