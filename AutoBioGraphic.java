package Practice;



public class AutoBioGraphic {
	public static boolean isAutoBioGraphic(String s) {
		int arr[]= new int[s.length()];
		for(int i= 0;i<s.length();i++) {
			arr[s.charAt(i)-'0']++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		
		if(s.equals(sb.toString()))return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isAutoBioGraphic("1210"));
	}
}
