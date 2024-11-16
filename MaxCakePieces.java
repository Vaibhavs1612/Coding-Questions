package Practice;

public class MaxCakePieces {
	public static int maxPieces(int n) {
		int res =(n*(n+1))/2;
		return res+1%1000000007;
	}
	public static void main(String[] args) {
		System.out.println(maxPieces(5));
	}
}
