package codes;

public class BianrySearch {
	
	public static int binarySearch(int arr[],int target) {
		int low = 0;
		int high = arr.length-1;
		int ans =-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(binarySearch(arr,2));
	}
}
