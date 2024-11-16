package Practice;

public class CheckSuperior {
	public static int countSuperior(int arr[]) {
		int n = arr.length;
		int cnt=0;
		boolean flag = false;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					flag=true;
				}
				else flag=false;
				if(flag==false) break;
			}
			if(flag==true)cnt++;
		}
		return cnt;
	}
	public static int optimized(int arr[]) {
		int n = arr.length;
		int cnt=0;
		for(int i=0;i<n;i++) {
			boolean flag = true;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag) cnt++;
		}
		return cnt;
	}
	public static int optimized2(int arr[]) {
		int sup = Integer.MIN_VALUE;
		int n = arr.length;
		int cnt=0;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]>sup) {
				cnt++;
				sup = arr[i];
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int arr[]= {40,8,10,6,2,9,7,1};
		System.out.println(countSuperior(arr));
		System.out.println(optimized(arr));
		System.out.println(optimized2(arr));
	}
}
