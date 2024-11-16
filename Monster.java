package Practice;
import java.util.Scanner;

public class Monster {
    public static int calculate2(int power[], int bonus[], int n, int e) {
        boolean visited[] = new boolean[n];
        int cnt = 0;
        
        // Traverse the array twice
        for (int round = 0; round < 2; round++) {
            for (int i = 0; i < n; i++) {
                System.out.println("*");
                if (power[i] <= e && visited[i] == false) {
                    e += bonus[i];
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();
        
        for (int testCase = 0; testCase < t; testCase++) {
            System.out.print("Enter the size of arrays (n): ");
            int n = sc.nextInt();
            
            int power[] = new int[n];
            int bonus[] = new int[n];
            
            System.out.println("Enter the power array:");
            for (int i = 0; i < n; i++) {
                power[i] = sc.nextInt();
            }
            
            System.out.println("Enter the bonus array:");
            for (int i = 0; i < n; i++) {
                bonus[i] = sc.nextInt();
            }
            
            System.out.print("Enter the initial energy (e): ");
            int e = sc.nextInt();
            
            int result = calculate2(power, bonus, n, e);
            System.out.println("Result for test case " + (testCase + 1) + ": " + result);
        }
        
        sc.close();
    }
}
