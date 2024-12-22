package Task5;

import java.util.*;
import java.util.stream.Collectors;

public class Question2 {
    // Write a program to check whether the Strings in the List are empty or not and
    // print the list having non-empty strings.

    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // "abe"," "be", "efg", "abcd","", "jkl"
        // Ask the user for the number of strings
        System.out.print("Enter the number of strings: ");
        int stringCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        List<String> strings = new ArrayList<>();
        System.out.println("Enter the strings (one per line):");
        for (int i = 0; i < stringCount; i++) {
            strings.add(scanner.nextLine());
        }

        // Filter non-empty strings using Stream API
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.trim().isEmpty()) // Check for non-empty strings
                .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmptyStrings);

        scanner.close();
    }
}
