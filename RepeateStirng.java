package Practice;

public class RepeateStirng {
	public static String repeate(String str,int n) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(str);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(repeate("abc",3));
	}
}
