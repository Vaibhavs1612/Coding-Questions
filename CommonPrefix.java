package Practice.GalaxE;

import java.util.Arrays;

public class CommonPrefix {
	public static String commonPrefix(String[] arr) {
		Arrays.sort(arr);
		String ans ="";
		int m = arr.length;
		String first = arr[0];
		String last = arr[m-1];
		int n = first.length();
		for(int i =0;i<n;i++) {
			if(last.charAt(i)!=first.charAt(i)) {
				break;
			}
			
			//to check the first element or prefix is same or not
			if(i==0) return "-1";
			
			ans = first.substring(0,i);
		}
		return ans;
		
	}
	public static void main(String[] args) {
		String[] arr = {"flower","flow","flight"};
		System.out.println(commonPrefix(arr));
	}
}
