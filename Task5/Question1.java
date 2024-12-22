package Task5;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class Question1 {
//    Write a program using map() method, to convert a list of Strings into uppercase.
//    If the given List is. Stream names = Stream of("abc", "d", "ef"),
    public static void main(String[] args) {

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of words
        System.out.print("Enter the number of words: ");
        int wordCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Enter the words (one per line):");
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = scanner.nextLine();
        }

        // Create a Stream from the user input
        Stream<String> names = Stream.of(words);

        // Convert to uppercase using map() and collect to a list
        List<String> upperCaseNames = names.map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCaseNames);

        scanner.close();
    }
}
