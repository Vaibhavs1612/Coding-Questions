package TCSNQT;

public class MinNoOfCoins {
	public static void main(String[] args) {
		int N = 13;
		int one =0,two=0;
		
		//for five
		int five = (N-4)/5;
		
		//for one
		if(((N-5*five)%2)==0) {
			one=2;
		}else {
			one =1;
		}
		
		//for two
		two = (N-5*five-one)/2;
		
		
		System.out.println("one"+one+"\n"+"two"+two+"\n"+"five"+five);
		
		
	}
}
