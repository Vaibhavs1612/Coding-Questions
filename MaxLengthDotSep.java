package codes;

public class MaxLengthDotSep {
	
	public static int maxLength(String str) {
		int max1 = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		String words[] = str.split("\\.");
		for(int i =0;i<words.length;i++) {
			max1 = words[i].length();
			max = Math.max(max, max1);
			
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(maxLength("a.b.cd"));
	}
}
