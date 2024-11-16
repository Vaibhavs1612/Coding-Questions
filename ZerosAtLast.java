package codes;

import java.util.Arrays;

public class ZerosAtLast {

	public static int[] push(int arr[]) {
		int n = arr.length;
		int ans[] = new int[n];
		int cnt =0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				ans[cnt++]=arr[i];
			}
		}
		for(int i=cnt;i<n;i++) {
			ans[i]=0;
		}
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,0,2,0,3};
		System.out.println(Arrays.toString(push(arr)));
	}
}
