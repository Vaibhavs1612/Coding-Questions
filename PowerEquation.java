package codes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PowerEquation {

	public static double solve(int a,int b,int c) {
		double ans =0;
		
		ans = Math.pow(a, 3) + Math.pow(a, 2) * b +2* (Math.pow(a, 2)) + 2*a * Math.pow(b, 2);
		
		return ans;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter value of a:");
        int a = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter value of b:");
        int b = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter value of c:");
        int c = Integer.parseInt(reader.readLine());

        System.out.println(solve(a, b, c));
	}
}
