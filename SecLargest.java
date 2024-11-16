
package codes;
import java.util.Arrays;


public class SecLargest {

	public static int bruteForce(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		int max = arr[n-1];
		
		for(int i=n-1;i>=0;i--) {
			if(arr[i]<max) {
				return arr[i];
			}
		}
		return 0;
	}
	
	public static int Better(int arr[]) {
		
		//find max first
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
//		System.out.println(max);
		
		//find the second max
		int secMax = -1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>secMax && arr[i]!= max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
	
	public static int Optimal(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secMax= 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i];
				
			}
			else if(arr[i]<max && arr[i]> secMax) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,1,1,1,3,4};
		System.out.println(bruteForce(arr));
		System.out.println(Better(arr));
		System.out.println(Optimal(arr));
	}
}
