package Practice.GalaxE;

import java.util.*;

public class OddEven {
	public static String oddEven(int[] arr) {
		String res ="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				res+="Even";
			}else
				res+="Odd";
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n = sc.nextInt();
//		sc.next();
		int m = sc.nextInt();
		int l = sc.nextInt();
		System.out.println(m+l);
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+"th "+"element");
			arr[i]=sc.nextInt();
		}
		int arr1[]= {1,2,34,5,6};
		System.out.println(oddEven(arr));
	}
}
