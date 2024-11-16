package codes;

public class CountAlphabet {

	public static void countPrint(String str) {
		int cnt =1;
		for(int i =1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				cnt++;
			}else {
				System.out.print(cnt+""+str.charAt(i-1));
				cnt=1;
			}
		}
		System.out.print(cnt+""+str.charAt(str.length()-1));

	}
	public static void main(String[] args) {
		countPrint("aaabbbdcxyzcc");
	}
}
