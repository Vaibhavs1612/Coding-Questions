package Practice;
import java.util.*;

public class AutoBioNum {
	public static int isAutoBioNumber(String s) {
		int arr[] = new int[10];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'0']++;
		}
//		Arrays.toString(arr);
//		return s.equals(arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < s.length(); i++) {
			sb.append(arr[i]);
		}
		if(s.equals(sb.toString())) {
			Set<Character> set = new HashSet<>();
			for(int i =0;i<sb.length();i++) {
				set.add(sb.charAt(i));
			}
			return set.size();
		}
		return 0;
		

//
//		// Compare the original string with the new string
//		return s.equals(sb.toString());
		
		
	}
	public static void main(String[] args) {
		System.out.println(isAutoBioNumber("6210001000"));
	}
}
