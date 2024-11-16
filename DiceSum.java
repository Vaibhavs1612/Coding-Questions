package codes;

public class DiceSum {
	public static int calculatePossiblities(int input) {
		int arr[] = {1,2,3,4,5,6,1,2,3,4,5,6};
		int n = arr.length;
		int i=0,j=n-1,cnt=0;
		while(i!=n-1 && j!=0) {
			int sum = arr[i]+arr[j];
//			System.out.println(sum);
			if(sum == input) {
				cnt++;
				i++;
//				j--;
			}
			if(sum<input){
				i++;
			}else {
				j--;
			}
		}
		return cnt;
		
	}
	public static int calculate(int sum) {
		int cnt =0;
		for(int i =1;i<7;i++) {
			for(int j=1;j<7;j++) {
				if(sum==i+j) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		System.out.println("output is: "+calculatePossiblities(5));
		System.out.println("output is: "+calculate(5));
	}
}
