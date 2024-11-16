package Practice;

import java.util.*;

public class countFreq2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int t = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  // Read the number of elements in the list
            int[] arr = new int[n];

            // Read the elements into the array
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }

            // Find the number with the highest frequency
            int result = findHighestFrequencyNumber(arr);

            // Print the result for this test case
            System.out.println(result);
        }

        scanner.close();
    }

    private static int findHighestFrequencyNumber(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the highest frequency
        int maxFrequency = Collections.max(frequencyMap.values());

        // Filter numbers that have the highest frequency and find the smallest among them
        int smallestNumberWithMaxFrequency = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency && entry.getKey() < smallestNumberWithMaxFrequency) {
                smallestNumberWithMaxFrequency = entry.getKey();
            }
        }

        return smallestNumberWithMaxFrequency;
    }
}
