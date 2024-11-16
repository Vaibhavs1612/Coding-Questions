package Practice;
import java.util.*;
import java.util.Map.Entry;
public class CountFreq {
	public static int countFreqOp(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int max = Integer.MIN_VALUE;
		int ans=0;
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			int val = entry.getValue();
			if(val>max) {
				max = val;
				ans = entry.getKey();
			}	
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		for(int i =0;i<n1;i++) {
			int n = sc.nextInt();
			int arr3[] = new int[n];
			for(int j =0;j<n;j++) {
				arr3[i]=sc.nextInt();
			}
			int result = countFreqOp(arr3);
		System.out.println(result);

		}
		sc.close();
//		int arr[]= {2, 4, 5, 2 ,3 ,2 ,4};
//		int arr2[]= {2, 1, 1, 2 ,1 ,2 ,4};
	}
}
