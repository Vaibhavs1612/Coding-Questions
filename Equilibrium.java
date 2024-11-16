package Practice;

public class Equilibrium {
	public static int checkEquilibrium(int arr[]) {
		int equilibrium = 0;
		int n = arr.length;
		
		for(int i = 1;i<n;i++) {
			equilibrium = i;
			int sum1=0,sum2=0;
			for(int j=0;j<=equilibrium;j++) {
				sum1 +=arr[j];
			}
			for(int k=equilibrium;k<n;k++) {
				sum2 +=arr[k];
			}
			if(sum1==sum2) {
				return equilibrium+1;	
			}
		}
		return 0000;
		
	}
	public static void main(String[] args) {
		int arr[]= {-7,2,4,9,-8,1,6};
		System.out.println(checkEquilibrium(arr));
	}
}
