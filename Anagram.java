package Practice;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s1 ,String s2) {
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
//		for(int i =0;i<arr1.length;i++) {
//			if(arr1[i]!=arr2[i])
//				return false;
//		}
//		return true;
		return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) {
		System.out.println(isAnagram("listen","silent"));
	}
}
