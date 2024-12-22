package Task5;

import java.util.*;
import java.util.stream.Collectors;

public class Question3 {
    // You are a teacher in a school with 10 students.
    // Separate students whose names start with "A" for special gifts.

    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine();

        List<String> students = new ArrayList<>();
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < studentCount; i++) {
            students.add(scanner.nextLine());
        }

        // Filter students whose names start with "A" using Stream API and lambda expression
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students receiving special gifts: " + specialGiftStudents);

        scanner.close();
    }
}
