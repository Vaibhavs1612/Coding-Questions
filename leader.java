package codes;

public class leader {
	public static int findLeader(int arr[]) {
		int max_so_far = 0;
		int sum = 0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>max_so_far) {
				sum+=arr[i];
			}
			max_so_far = Math.max(max_so_far, arr[i]);
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {16,17,4,3,5,2};
		int arr2[] = {52,66,64,36,45,24,32};
		System.out.println(findLeader(arr));
		System.out.println(findLeader(arr2));
	}
}
