package Practice;

public class SnakeWater2 {
    public static int win2(String str) {
        int count = 0;
        int n = str.length();
        
        // Iterate over the string in steps of 10
        for (int i = 0; i + 9 < n; i += 10) {
            String moveA = str.substring(i, i + 5);  // Move of player A
            

            // Check if player A wins based on the rules
            if ((moveA.equals("snake") |
                (moveA.equals("water") | 
                (moveA.equals("gun") )))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test the function with various inputs
        String input1 = "gunsnake"; // Test input
        String input2 = "snakewatergun"; // Another test input
        String input3 = "snakewatergunwatergun"; // Another test input

        System.out.println("Player A wins with input1: " + win2(input1) + " times");
        System.out.println("Player A wins with input2: " + win2(input2) + " times");
        System.out.println("Player A wins with input3: " + win2(input3) + " times");
    }
}
