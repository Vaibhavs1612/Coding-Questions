package codes;

public class BinaryToSecSumBits {
	
	public static String toBinary(int n) {
		String str ="";
		while(n>0) {
			int rem = n %2;
			str = rem + str;
			n/=2;
		}
		return str;
	}
	public static int toDecimal(String binary) {
		int base=1;
		int num=0;
		for(int i = binary.length()-1;i>=0;i--) {
			if(binary.charAt(i)=='1') {
				num = num+base;
			}
			base*=2;
		}
		return num;
	}
	public static int sumBits(int n) {
		int sum =0;
//		String str = Integer.toBinaryString(n);
		
		String str = toBinary(n);
		System.out.println("Binary representation of "+n+" is "+str);
		int number = toDecimal(str);
		System.out.println("Decimal representation of "+str+" is "+number);
		for(int i =0;i<str.length();i++) {
			sum += str.charAt(i)-'0';
		}
		return sum;
	}
	public static int sumBits2(int n) {
		int sum =0;
		while(n>0) {
			sum+=n%2;
			n/=2;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumBits(10));
		System.out.println("second approch  "+sumBits2(10));
	}
}
