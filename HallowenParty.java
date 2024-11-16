package codes;

public class HallowenParty {
	
	public static int calMax(int arr[],int p) {
		int cnt =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				cnt++;
			}else if(p!=0) {
				p=p-arr[i];
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int arr[] = {5,10,15,2,3,4,1};
		System.out.println(calMax(arr,9));
	}
}
