package Practice;

public class findDiffOfSum {
	public static int findDiffOfSumOp(int m,int n) {
		int sum1=0,sum2=0;
		for(int i =1;i<=m;i++) {
			if(i%n==0) {
				sum1+=i;
			}else {
				sum2+=i;
			}
		}
		return Math.abs(sum1-sum2);
	}
	public static void main(String[] args) {
		System.out.println(findDiffOfSumOp(20,4));
	}
}
