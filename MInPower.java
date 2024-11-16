package Practice;

public class MInPower {
	public static int calculatePower(int p,int x,int y) {
		int M = p/100;
		int N = p%100;
		if(N==0) return M*x;
		else if(N<4) return (M*x)+N;
		else {
			int t = N/4;
			if(t%4!=0) {
				t++;
			}
			return (M*x)+(t*y);
		}
		
	}
	public static void main(String[] args) {
		System.out.println(calculatePower(10000,10,2));
	}
}
