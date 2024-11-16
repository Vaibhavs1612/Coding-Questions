package Practice;

public class SubSeq {
	public static boolean isPresent(String mainString,String subString) {
		int mainIndex = 0;
		int subIndex = 0;
		while(mainIndex<mainString.length() && subIndex<subString.length()) {
			if(mainString.charAt(mainIndex)==subString.charAt(subIndex)) {
				subIndex++;
			}
			mainIndex++;
		}
		if(subIndex==subString.length())
			return true;
		return false;
	}
	public static void main(String[] args) {
System.out.println(isPresent("vaibhav","vbhi"));
	}
}
