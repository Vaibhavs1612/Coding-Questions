package Practice;

public class SecondLargest {
	public static int findSecLargest(int arr[],int n) {
		int large=Integer.MAX_VALUE;
		int secLarge= 0;
		
		for(int i =0;i<n;i++) {
			if(arr[i]<large) {
				secLarge = large;
				large = arr[i];
			}
			if(arr[i]>secLarge) {
				secLarge = arr[i];
			}
		}
		return secLarge;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		System.out.println(findSecLargest(arr,4));
	}
}
