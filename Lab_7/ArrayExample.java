package Lab_7;

public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,};

        try {
            // Trying to access an element outside the array bounds
            int number = numbers[10];
            System.out.println("The number at index 10 is: " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: Attempted to access an element outside the array bounds.");
        }

        System.out.println("Program continues...");
    }
}
