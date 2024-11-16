package Practice;

public class KadaneAlgo {
	public static int MaxSubarraySum(int arr[]) {
		int maxSum=Integer.MIN_VALUE;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int sum =0;
			for(int j=i;j<n;j++) {
				sum +=arr[j];
				maxSum = Math.max(maxSum, sum);
			}
			
		}
		return maxSum;
	}
	public static int MaxSubarraySum2(int arr[]) {
		int maxSum =0;
		int currSum=0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			currSum = currSum +arr[i];
			if(currSum>maxSum) {
				maxSum = currSum;
			}
			if(currSum<0) {
				currSum =0;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaxSubarraySum2(arr));
	}
}
