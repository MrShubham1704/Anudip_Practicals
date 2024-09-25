package Lab_7;

public class DivisionByZeroHandling {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempting to divide by zero
            int result = numerator / denominator;
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues...");
    }
}
