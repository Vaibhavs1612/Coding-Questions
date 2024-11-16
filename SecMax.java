package codes;

public class SecMax {
	
	public static int findSecMax(int arr[]) {
		int max =0;
		int secMax = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i];
			}
			if(arr[i]>secMax && arr[i]!=max) {
				secMax = arr[i];
			}
		}
		return secMax;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,100,101,999};
		System.out.println(findSecMax(arr));
	}
}
