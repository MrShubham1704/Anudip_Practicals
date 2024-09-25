package LAB_6;

import java.util.Scanner;

public class CheckPrimeAndCube {
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];

		// Input 10 elements
		System.out.println("Enter 10 integers:");
		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println("Cubes of prime numbers in the array:\n");
		for (int number : numbers) {
			if (isPrime(number)) {
				System.out.println(number + "^3 = " + (number * number * number));
			}
		}

		scanner.close();
	}

	// Method to check if a number is prime
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
