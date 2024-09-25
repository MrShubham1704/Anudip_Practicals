package Lab_7;

import java.util.Scanner;

public class AgeVerification {
    
    // Method to verify age and throw InvalidAgeException if age is less than 18
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            // Attempt to check the age
            checkAge(age);
            System.out.println("Age verified. You are eligible.");
        } catch (InvalidAgeException e) {
            // Handling the custom exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

        System.out.println("Program continues...");
    }
}
