package Practice;
import java.util.*;

public class Sum {
	public static List<List<Integer>> findSum(int arr[]){
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		int n = arr.length;
		int i=0;
		int j=n-1;
		
		while(i<j) {
			List<Integer> list1 = new ArrayList<>();
			int sum=arr[i]+arr[j];
			
			if(sum<6 && sum!=5) {
				j--;
			}
			if(sum>6) {
				i++;
			}
			if(sum==6) {
				list1.add(arr[i]);
				list1.add(arr[j]);
				i++;
				j--;
			}
			if(sum==5) {
				list1.add(arr[i]);
				list1.add(arr[j]);
				i++;
				j--;
			}
			list.add(list1);
			
		}
		return list;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(findSum(arr));
	}
}
