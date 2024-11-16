package codes;

public class EquilibriumIndex {

	public static void findEquilibriumPoint(int[] arr) {
		int n = arr.length;
		int prefix[] = new int[n];
		int sufix[] = new int[n];
		int sum1=0;
		for(int i =0;i<n;i++) {
			sum1=sum1+arr[i];
			prefix[i]=sum1;
		}
		for(int i =0;i<n;i++) {
			System.out.print("|"+prefix[i]+"|");
		}
		System.out.println();
		int sum2=0;
		for(int i=n-1;i>=0;i--) {
			sum2=sum2+arr[i];
			sufix[i]=sum2;
		}
		for(int i =0;i<n;i++) {
			System.out.print("|"+sufix[i]+"|");
		}
		System.out.println();
		for(int i =0;i<n;i++) {
			if(prefix[i]==sufix[i]) {
				System.out.println(i);
			}
		}
		
	}
	public static void findEquilibriumPoint2(int[] arr) {
		int totalSum =0;
		int leftSum =0;
		for(int num : arr) {
			totalSum+=num;
		}
		for(int i =0;i<arr.length;i++) {
			totalSum-=arr[i];
			if(totalSum == leftSum) {
				System.out.println(i);
			}
			leftSum+=arr[i];
		}
	}
	public static void main(String[] args) {
		int arr[] = {2,3,-1,8,4};
		findEquilibriumPoint(arr);
		findEquilibriumPoint2(arr);
	}
}
