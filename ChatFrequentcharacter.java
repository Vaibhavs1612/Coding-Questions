package Practice;
import java.util.*;
public class ChatFrequentcharacter {
	public static void chatFrequentcharacterOp(String s,char x) {
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		int max=0;
		char ch=' ';
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			int val = entry.getValue();
//			max = Math.max(val, max);1
			if(val>max) {
				 ch=entry.getKey();
				 max=val;
			}
			
		}
		String newStr=s.replace(ch, x);
		System.out.println(newStr);
		
	}
	public static void main(String[] args) {
		chatFrequentcharacterOp("bbadbbababb", 't');
	}
}
