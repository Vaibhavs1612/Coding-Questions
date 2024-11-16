package codes;

public class StarHash {
	
	public static String isValid(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='*') {
				count++;
			}else
				count--;
		}
		if(count==0) {
			return "Valid";
		}
		return "Invalid";
	}

	public static void main(String[] args) {
		System.out.println(isValid("**#*###"));
	}
}
