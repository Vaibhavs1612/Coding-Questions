package Practice;

import java.util.Arrays;

public class ProductSmallestPair {
	public static int ProductSmallestPairOp(int arr[],int sum) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]<=sum) {
					return arr[i]*arr[j];
				}
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {5 ,2, 4 ,3, 9 ,7 ,1};
System.out.println(ProductSmallestPairOp(arr,9));
	}
}
