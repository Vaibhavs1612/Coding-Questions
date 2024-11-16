package Practice;

public class ReverseTheNumber {
	public static String Reverse(int n) {
		StringBuilder res=new StringBuilder();
		while(n!=0) {
			int last = n%10;
			res.append(last);
			n = n/10;
		}
		return res.toString();
		
	}
	public static int Reverse2(int n) {
		int resverseNum=0;
		while(n!=0) {
			int digit=n%10;
			resverseNum = (resverseNum*10)+digit;
			n/=10;
		}
		return resverseNum;
	
	}
	public static void main(String[] args) {
		System.out.println(Reverse2(234));
	}
}
