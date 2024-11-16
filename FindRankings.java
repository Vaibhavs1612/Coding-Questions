package codes;

import java.io.*;
import java.util.*;

public class FindRankings {

    public static String rankTeams(String[] votes) {
        if (votes == null || votes.length == 0) return "";

        int numTeams = votes[0].length();
        Map<Character, int[]> rankMap = new HashMap<>();

        // Initialize the rank map
        for (char team : votes[0].toCharArray()) {
            rankMap.put(team, new int[numTeams]);
        }

        // Update ranking counts
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                char team = vote.charAt(i);
                rankMap.get(team)[i]++;
            }
        }

        // Sort teams by rank
        List<Character> teams = new ArrayList<>(rankMap.keySet());
        teams.sort((a, b) -> {
            for (int i = 0; i < numTeams; i++) {
                if (rankMap.get(a)[i] != rankMap.get(b)[i]) {
                    return rankMap.get(b)[i] - rankMap.get(a)[i];
                }
            }
            return a - b;
        });

        // Convert sorted list to result string
        StringBuilder result = new StringBuilder();
        for (char team : teams) {
            result.append(team);
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        // Create BufferedReader to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user to enter the votes
        System.out.println("Enter the votes (comma-separated, e.g., ABC, ACB, ...): ");
        String input = reader.readLine();

        // Split the input into rounds of votes
        String[] rounds = input.split(", ");

        // Call the rankTeams method and print the result
        System.out.println(rankTeams(rounds));  // Output the ranking
    }
}
