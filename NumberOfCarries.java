package Practice;

public class NumberOfCarries {
	public static int numberOfCarriesOp(int num1,int num2) {
		int carray = 0;
		int count =0;
		while(num1!=0 || num2!=0) {
			int rem1 = num1%10;
			int rem2 = num2%10;
			
			int sum = rem1+rem2+carray;
			if(sum>9) {
				carray = sum/10;
				count++;
			}
			num1 /=10;
			num2/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(numberOfCarriesOp(999999999,999999999));
	}
}
