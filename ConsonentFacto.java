package codes;

public class ConsonentFacto {
	
	
	public static boolean isConso(char s) {
	    return s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u';
	}
	
	public static int countCons(String word) {
		int len =0;
		for(int i =0;i<word.length();i++) {
			if(isConso(word.charAt(i))) {
				len++;
			}
		}
		return len;
	}
	
	public static int finalLen(String arr[]) {
		int max =0;
		for(int i =0;i<arr.length;i++) {
			int len =countCons(arr[i]);
			max = Math.max(max, len);
		}
		return max;
	}
	
	public static int findFact(int n) {
		int fact=1;
		for(int i =1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		String arr[] = {"hello","aeiohjkigg","he"};
		int res = finalLen(arr);
		System.out.println(findFact(res));
	}
}
