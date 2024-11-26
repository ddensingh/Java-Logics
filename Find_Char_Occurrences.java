package String_Logics;

import java.util.Scanner;

public class Find_Char_Occurrences {

    // Method to find the occurrences of a character in a string
    public static int findOccurrences(String input, char target) {
        int count = 0;

        // Loop through the string to check each character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Get user input for the target character
        System.out.println("Enter the character to find its occurrences:");
        char target = scanner.next().charAt(0);

        // Call the method and display the result
        int occurrences = findOccurrences(input, target);
        System.out.println("The character '" + target + "' appears " + occurrences + " time(s) in the string.");

        scanner.close();
    }
}
