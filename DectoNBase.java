package Practice;
import java.util.*;
public class DectoNBase {
	public static String dectoNBase(int num,int n) {
		String res = "";
		int quoteint = num/n;
		ArrayList<Integer> rem = new ArrayList<>();
		rem.add(num%n);
		
		while(quoteint!=0) {
			rem.add(quoteint%n);
			quoteint=quoteint/n;
		}
		
		for(int i=0;i<rem.size();i++) {
			if(rem.get(i)>9) {
				res = (char)(rem.get(i)-9+64)+res;
			}
			else {
				res = rem.get(i)+res;
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		System.out.println(dectoNBase(718,12));
	}
}
