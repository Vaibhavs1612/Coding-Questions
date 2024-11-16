package Practice;

public class MoveHyphen {
	public static String moveHyphenOp(String str,int n) {
		String res ="";
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='-') {
				res="-"+res;
			}else {
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(moveHyphenOp("p-o-o-j-a-v-a-i-b-h-a-v",23));
	}
}
