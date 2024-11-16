package Practice.GalaxE;

public class reverseSum {

	public static int  sum(int arr[]) {
		int sum =0;
		for(int i =arr.length-1;i>=0;i--) {
			if((i+1)%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		int[] arr2 = {21,24,67,13,24,27};
		System.out.println(sum(arr));
		System.out.println(sum(arr2));
	}

}
