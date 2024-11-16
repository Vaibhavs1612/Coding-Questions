package codes;

import java.util.*;

public class SubSet {
	public static boolean isSubset(int arr1[],int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		
		Map<Integer,Boolean> map = new HashMap<>();
		for(int i =0;i<m;i++) {
			map.put(arr2[i],true);
		}
		for(int i =0;i<n;i++) {
			if(map.containsKey(arr1[i])== false) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		int arr1[] = {1,2,3,9};
		int arr2[]= {1,2,3,4,5};
		System.out.println(isSubset(arr1,arr2));
	}
}
