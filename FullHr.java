package codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FullHr {

    public static int calculate(int arr[]) {
        Map<Integer,Integer> map = new HashMap<>();
        int cnt =0;
        for(int num : arr) {

        	int required = 60 - num;
        	
        	if(map.containsKey(required)) {
        		cnt+=map.get(required);
        	}
        	map.put(num%60, map.getOrDefault(num%60, 0)+1);
        }
        return cnt;
        
    }
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        int result = calculate(arr);
     
        System.out.println("Result: " + result); // Output: 4 (distinct elements)
    
    }
}
