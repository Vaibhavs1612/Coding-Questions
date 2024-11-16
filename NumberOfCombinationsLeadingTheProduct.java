package Practice;

import java.util.Arrays;

public class NumberOfCombinationsLeadingTheProduct {

	public static int countNoOfCombinationsLeadingProductOp(int n , int arr[],int target) {
		int count =0;
		for(int i =0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k = j+1;k<n;k++) {
					if(arr[i]*arr[j]*arr[k]==target) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public static int second(int n,int arr[],int target) {
		int count=0;
		Arrays.sort(arr);
		for(int i =0;i<n-2;i++) {
			int j=i+1;
			int k=n-1;
			
			while(j<k) {
				int product = arr[i]*arr[j]*arr[k];
				if(product == target) {
					count++;
					j++;
					k--;
				}
				if(product<target) {
					j++;
				}
				if(product > target ) {
					k--;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {5,3,20,10,1,4,2};
		System.out.println(countNoOfCombinationsLeadingProductOp(7,arr,60));
		System.out.println(second(7,arr,60));

	}
}
