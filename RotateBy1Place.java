package Practice;

import java.util.Arrays;

public class RotateBy1Place {

	public static String rotate(int[] arr) {
		int a = arr[0];
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=a;
		return Arrays.toString(arr);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,4,5};
		System.out.println(rotate(arr));
	}

}
