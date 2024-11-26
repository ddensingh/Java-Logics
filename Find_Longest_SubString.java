package String_Logics;

import java.util.HashSet;

public class Find_Longest_SubString {

    // Method to find the longest substring without repeating characters
    public static String findLongestSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        int maxLength = 0;
        int start = 0;
        String longestSubstring = "";

        // Use a set to track characters in the current substring
        HashSet<Character> charSet = new HashSet<>();

        for (int end = 0; end < input.length(); end++) {
            char currentChar = input.charAt(end);

            // If the character is already in the set, shrink the window from the left
            while (charSet.contains(currentChar)) {
                charSet.remove(input.charAt(start));
                start++;
            }

            // Add the current character to the set
            charSet.add(currentChar);

            // Update the longest substring if necessary
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = input.substring(start, end + 1);
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        String result = findLongestSubstring(input);
        System.out.println("The longest substring without repeating characters is: " + result);
    }
}
