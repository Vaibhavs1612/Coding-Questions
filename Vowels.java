package Practice.GalaxE;

public class Vowels {
	public static int vowels(String str) {
		int cnt =str.length();
		for(int i =0;i<str.length();i++) {
			char ch = Character.toLowerCase(str.charAt(i)); // handle uppercase vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cnt--;
            }
		}
//		System.out.println(cnt);
		if(cnt==0) return 0;
		else
		return fact(cnt);
	}
	public static int fact(int cnt) {
		
		if(cnt == 0) return 1;
		return cnt * fact(cnt-1);
		
	}
	public static void main(String[] args) {
		System.out.println(vowels("vaibhav"));
	}
}
