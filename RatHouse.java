package Practice;

public class RatHouse {
	public static int countHouses(int arr[],int r,int unit,int n) {
		int result = unit*r;
		int sum =0;
		int count = 0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			count++;
			if(sum>=result) {
				break;
			}
			
		}
		if(sum<result) return 0;
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {2,8,3,5,7,4,1,2};
System.out.println(countHouses(arr,10,2,8));
	}
}
