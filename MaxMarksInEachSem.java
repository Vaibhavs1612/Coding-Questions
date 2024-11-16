package codes;

import java.util.*;

public class MaxMarksInEachSem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of sem");
		int n = sc.nextInt();
		
		int maxMark[] = new int[n];
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter number of subjects in sem"+""+(i+1));
			
			int sub = sc.nextInt();
			
			int maxMarks = -1;
			
			for(int j =0;j<sub;j++) {
				System.out.println(j+1+"th sub");
				int mark = sc.nextInt();
				
				if(mark<0 || mark>100) {
					System.out.println("Inv");
					return;
				}
				if(mark>= maxMarks) {
					maxMarks = mark;
				}
			}
			maxMark[i]=maxMarks;
			
		}
		
		for(int i =0;i<n;i++) {
			System.out.println(maxMark[i]);
		}
		
	}
}
