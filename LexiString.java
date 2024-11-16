package codes;
import java.util.*;

public class LexiString {

	public static String solve(String str,String s) {
		int n = str.length();
		char[] arr = str.toCharArray();
		StringBuilder ans = new StringBuilder();
		for(int i =0;i<n;i++) {
			for(int j=0;j<s.length();j++) {
				if(arr[i]==s.charAt(j)) {
					ans.append(arr[i]);
				}
			}
		}
		return ans.toString();
	}
	public static String solve2(String str,String s) {
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		StringBuilder ans = new StringBuilder();
		for(char ch : str.toCharArray()) {
			if(map.containsKey(ch)) {
				ans.append(ch);
			}
		}
		return ans.toString();
	}
	public static void main(String[] args) {
		System.out.println(solve("dxybzlamnc","abcd"));
		System.out.println(solve2("dxybzlamnc","abcd"));
	}
}
