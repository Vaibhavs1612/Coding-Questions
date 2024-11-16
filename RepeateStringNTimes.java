package Practice;
import java.util.*;

public class RepeateStringNTimes {
	public static void repeate(String str,int n) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<n;i++) {
			sb.append(str);
		}
		System.out.print(sb.toString());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the string");
		String str = sc.nextLine();
		
		
		repeate(str,n);
		sc.close();
		
	}
}
