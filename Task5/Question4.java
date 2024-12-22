package Task5;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question4 {
//      Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age java.time LocalDate class you have to help him to build this app using the
//
//      Input
//
//             Enter your birthdate (yyyy-mm-dd) 1990-05-15
//
//      Output
//
//          Your age is. 33 years, 4 months, and 13 days

        public static void main(String[] args) {
            // Create a Scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter their birthdate
            System.out.print("Enter your birthdate (yyyy-mm-dd): ");
            String birthdateInput = scanner.nextLine();

            try {
                // Parse the input to LocalDate
                LocalDate birthdate = LocalDate.parse(birthdateInput);

                // Get the current date
                LocalDate currentDate = LocalDate.now();

                // Check if the birthdate is valid (not in the future)
                if (birthdate.isAfter(currentDate)) {
                    System.out.println("Birthdate cannot be in the future.");
                    return;
                }

                // Calculate the period between the two dates
                Period age = Period.between(birthdate, currentDate);

                // Display the age
                System.out.printf("Your age is: %d years, %d months, and %d days%n",
                        age.getYears(), age.getMonths(), age.getDays());

            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
            } finally {
                scanner.close();
            }
        }


}
