package Practice.GalaxE;

import java.util.Arrays;

public class Majority {
	public static int majorityElement(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			int num = arr[i];
			int cnt =0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==num) {
					cnt++;
				}
				if(cnt>= (arr.length/2)) {
					return num;
				}
			}
			
		}
		return -1;
	}
	public static int sort(int[] arr) {
		Arrays.sort(arr);
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				cnt++;
			}
			if(cnt>=(arr.length/2)) return arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,1,3,3,3,3,1,1,1,1,1,1,3,3,3,3};
		System.out.println(majorityElement(arr));
		System.out.println(sort(arr));
	}
}
