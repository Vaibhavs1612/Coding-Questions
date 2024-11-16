//package codes;
//import java.util.*;
//
//public class MinDiscount {
//
//	public static int findMin(String str,int n) {
//		String[] input = str.split(",");
//		int min = new int[n];
//		int ind =0;
//		for(int i =1;i<input.length-1;i++) {
//			int dis = input[i]-'0' * input[i+1]-'0';
//			min[ind] = Math.min(min, dis*100);
//		}
//		return min;
//		
//	}
//	public static void main(String[] args) {
//		
//	}
//}
