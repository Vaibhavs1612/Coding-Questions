package Practice;
import java.util.*;

public class SetBitsAtLast {
	public static int set(int n) {
		int count=0;
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		for(int ch:binary.toCharArray()) {
			if(ch=='1') {
				count++;
			}
		}
		System.out.println(count);
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<binary.length()-count;i++) {
			sb.append('0');
		}
		for(int i =0;i<count;i++) {
			sb.append('1');
		}
		System.out.println(sb);
		int result = Integer.parseInt(sb.toString(),2);
		return result;
		
	}
	public static int set2(int n) {
//		String binaryString = Integer.toBinaryString(n);
//		System.out.println(binaryString);
		int count = Integer.bitCount(n);
		int result = (1<<count)-1;
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(set2(10));
	}
}
