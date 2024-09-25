package Lab_7;

import java.util.Scanner;

public class NegativeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        try {
            // Check if the number is negative
            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            System.out.println("You entered: " + number);
        } catch (IllegalArgumentException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Program continues...");
    }
}
