package Lab_1;

import java.util.Scanner;

public class Prime_Number {
	public static boolean isPrime(int number) {
		// Handle edge cases
		if (number <= 1) {
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}

		// Check for factors from 3 to the square root of the number
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first No: ");
		int number=Integer.parseInt( sc.nextLine());

		// Main method to test the isPrime method

		// You can change this number to test with other values

		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}


}


