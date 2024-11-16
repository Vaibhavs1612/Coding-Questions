package Practice;
import java.util.*;
public class DecideCaseConvert {
	public static void conevert(String str) {
		
		int n = str.length();
		int upperCase=0;
		int lowerCase=0;
		for(int i=0;i<n;i++) {
			char ch= str.charAt(i);
			if(Character.isUpperCase(ch)) upperCase++;
			else lowerCase++;
		}
//		System.out.println(upperCase);
		if(upperCase>lowerCase) {
			System.out.println(str.toUpperCase());
		}else {
			System.out.println(str.toLowerCase());
		}
//		System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		conevert(str);
		sc.close();
	}
}
