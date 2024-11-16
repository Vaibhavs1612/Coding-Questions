package codes;

public class ToggleBit {

	public static int toggle(int n) {
		
		String binary = Integer.toBinaryString(n);
		System.out.print(binary+"  ");
		System.out.println(n);
		StringBuilder sb = new StringBuilder();
		for(char bit : binary.toCharArray()) {
			sb.append(bit=='0'?'1':'0');
		}
		System.out.print(sb+"  ");
		int result = Integer.parseInt(sb.toString(),2);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(toggle(10));
	}
}
