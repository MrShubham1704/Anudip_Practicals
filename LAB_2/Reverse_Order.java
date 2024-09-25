package LAB_2;
import java.util.Scanner;
public class Reverse_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a positive integer
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();

		// Check if the number is positive
		if (number <= 0) {
			System.out.println("Please enter a positive integer.");
		} else {
			System.out.print("The digits in reverse order are: ");
			// Loop to extract and print each digit in reverse order
			while (number != 0) {
				int digit = number % 10;
				System.out.print(digit);
				number /= 10;
			}
			System.out.println();
		}

		scanner.close();
	}
}

