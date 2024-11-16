package Practice;
import java.util.*;

public class OperationsBinaryString {
	public static int OperationsBinaryStringOp(String str) {
		Stack<Character> st = new Stack<>();
		st.push(str.charAt(0));
		int i=1;
		int res = str.charAt(0)-'0';
		while(st.isEmpty()) {
			if(str.charAt(i)=='A') {
				int n =st.pop()-'0';
				res = res & str.charAt(i+1)-'0';
				i++;
			}
			if(str.charAt(i)=='B') {
				int n =st.pop()-'0';
				res = res | str.charAt(i+1)-'0';
				i++;
			}
			if(str.charAt(i)=='C') {
				int n =st.pop()-'0';
				res = res ^ str.charAt(i+1)-'0';
				i++;
			}
			
		
		}
		return res;
		
	}
	public static int correctMtd(String str) {
		int res = str.charAt(0)-'0';
		for(int i =1;i<str.length();i+=2) {
			char operator = str.charAt(i);
			int operand = str.charAt(i+1)-'0';
			
			if(operator=='A') {
				res = res & operand;
			}
			if(operator=='B') {
				res = res | operand;
			}else {
				res = res ^ operand;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(OperationsBinaryStringOp("1A0"));
		System.out.println("correct output is:->"+correctMtd("0C1A1B1C1C1B0A0"));

	}
}
