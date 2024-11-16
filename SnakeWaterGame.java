package Practice;
import java.util.*;

public class SnakeWaterGame {
	public static int win(String str) {
		
		if(str.equals("snakewater") | str.equals("watergun") | str.equals("gunsnake")) {
			return 1;
		}
		return 0;
	}
	public static int win2(String str) {
		int count=0;
		int n  = str.length();
		for(int i=0;i<n;i=i+9) {
			char ch = str.charAt(i);
			if(ch=='s')count++;
			if(ch=='d')count++;
		}
		return count;
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter how many rounds you want");
//		int n = sc.nextInt();
//		sc.nextLine();
//		int totalWins=0;
//		int round =1;
//		for(int i =0;i<n;i++) {
//			System.out.println("\n \n     **Round "+round+" out of "+n+"**\n\n");
//			System.out.println("Enter A's move");
//			String A = sc.nextLine().toLowerCase();
//			System.out.println("Enter B's move");
//			String B = sc.nextLine().toLowerCase();
//			String str = A+B;
//			
//			totalWins+=win(str);
//			round++;
//		}
//		System.out.println("\n\n A wins "+totalWins+" times");
//		
		
	
		System.out.println(win2("snakegunwatergunwatergun"));
			
		
//		sc.close();
		
	}
}
