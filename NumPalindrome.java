package Practice;
import java.util.*;
public class NumPalindrome {
	
	public static ArrayList<Integer> palindriomes(int n , int m) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =n;i<=m;i++) {
			if(isPalindrome(i)) {
				list.add(i);
			}
		}
		return list;
	}
	public static boolean isPalindrome(int n) {
		int temp = n;
		int newNumber =0;
		while(temp!=0) {
			int rem = temp%10;
			newNumber = newNumber*10+rem;
			temp/=10;
		}
		if(n==newNumber) return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(1371));
		System.out.println(palindriomes(10,80));
	}
}
