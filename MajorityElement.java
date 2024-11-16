package Practice;
import java.util.*;
import java.util.Map.Entry;

public class MajorityElement {
	public static int majority(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		int maxFreq =Integer.MIN_VALUE;
		int ans=0;
		for(int n: arr) {
			map.put(n,map.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>maxFreq) {
				maxFreq = entry.getValue();
				ans = entry.getKey();
				
			}
			
		}
		System.out.println(ans+" is repeated "+ans+""+" times");
		return 0;
	}
	public static void numberCharacter(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(char ch: str.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.print(entry.getValue()+""+entry.getKey());
			
		}
	}
	public static void numberCharacter2(String str) {
		char arr[] = str.toCharArray();
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,4,5,4};
//		System.out.println("mahority is  ");
		majority(arr);
		numberCharacter("vaibhav");
		
	}
}
