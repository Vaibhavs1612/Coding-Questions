package codes;

public class StringGame {

    public static String game(String A, String B) {
    	StringBuilder result = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);

            if (B.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(game("talent", "tens"));  // Output: "alt"
    }
}
