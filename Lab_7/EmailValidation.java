package Lab_7;

import java.util.Scanner;

public class EmailValidation {
    
    // Method to validate email and throw InvalidEmailException if it doesn't meet criteria
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("Invalid email format. Email must contain '@' and '.'");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        try {
            // Attempt to validate the email
            validateEmail(email);
            System.out.println("Email is valid.");
        } catch (InvalidEmailException e) {
            // Handling the custom exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Program continues...");
    }
}
