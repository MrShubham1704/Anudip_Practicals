package Lab_7;

public class ExcptionHandling {

    
    // Method to divide two numbers, declares that it throws an ArithmeticException
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Attempting to divide using the method that may throw an ArithmeticException
            int result = divide(numerator, denominator);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues...");
    }
}
