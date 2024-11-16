package Practice;

public class BestTimeTOBuyAndSell {
	public static int bestTime(int arr[]) {
		
		int n = arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int ind=0;
		for(int i=0;i<n;i++) {
			if(i!=n-1) {
				if(arr[i]<min) {
					min = arr[i];
					ind = i;
				}
			}
			if(i>ind) {
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			
		}
		System.out.println("BUY AT  "+min);
		System.out.println("SELL AT  "+max);
		if((max-min)<0)return 0;
		
		return max-min;
		
	}
	public static int twoPointer(int arr[]) {
		int n = arr.length;
		int maxProfit = 0;
		for(int i =0;i<n;i++) {
			int profit =0;
			for(int j =i;j<n;j++) {
				profit =arr[j]-arr[i];
				maxProfit = Math.max(profit,maxProfit);
			}
		}
		return maxProfit;
	}
	public static int minSoFarOptimal(int arr[]) {
		int n = arr.length;
		int maxProfit = 0;
		int minsofar=arr[0];
		for(int i=0;i<n;i++) {
			minsofar = Math.min(arr[i], minsofar);
			int profit = arr[i]-minsofar;
			maxProfit = Math.max(profit, maxProfit);
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		int arr[]= {7,2,10,20};
		System.out.println(bestTime(arr));
		System.out.println(twoPointer(arr));
		System.out.println(minSoFarOptimal(arr));
	}
}
