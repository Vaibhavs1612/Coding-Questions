package Practice;

public class findCount {
	public static int findCountOp(int arr[],int length,int diff,int num) {
		int count=0;
		for(int i=0;i<length;i++) {
			int absDiff = Math.abs(num-arr[i]);
			if(absDiff<=diff) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {12,3,14,56,77,13};
		System.out.println(findCountOp(arr,6,2,13));
	}
}
